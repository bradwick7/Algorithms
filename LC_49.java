import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC_49 {

    public static List<List<String>> groupAnagramsQuick(String[] strs) {
        List<List<String>> listOfLists = new ArrayList<>();
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = new char[26];
            for (char c : str.toCharArray()) {
                charArray[c - 'a']++;
            }
            String charString = new String(charArray);
            if (!anagramMap.containsKey(charString)) {
                List<String> listOfStrings = new ArrayList<String>();
                anagramMap.put(charString, listOfStrings);
            }
            anagramMap.get(charString).add(str);
        }
        listOfLists.addAll(anagramMap.values());
        return listOfLists;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listOfLists = new ArrayList<List<String>>();
        HashMap<List<String>, List<String>> anagramMap = new HashMap<List<String>, List<String>>();
        // Check if words are anagrams
        for (int i = 0; i < strs.length; i++) {
            List<String> listOfStrings = new ArrayList<String>();
            for (int j = 0; j < strs.length; j++) {
                if (areAnagrams(strs[i], strs[j])) {
                    listOfStrings.add(strs[j]);
                }
            }
            anagramMap.put(listOfStrings, listOfStrings);
        }
        // Store result in 'listOfLists'
        anagramMap.forEach((key, value) -> {
            listOfLists.add(value);
        });
        return listOfLists;
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[26];
        // Count char ocurrences for the first word
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            charCount[c - 'a']++;
        }
        // Count char ocurrences for the second word
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            charCount[c - 'a']--;
        }
        // If every element in 'charCount' is 0 then the words are anagrams
        for (int i : charCount) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        // output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(groupAnagramsQuick(strs));
    }
}
