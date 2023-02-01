public class LC_21 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class MergeLists {
        ListNode head;

        public void addToLast(ListNode node) {
            if (head == null) {
                head = node;
            } else {
                ListNode temp = head;
                while (temp.next != null)
                    temp = temp.next;
                temp.next = node;
            }
        }

        void printList() {
            System.out.println("Merged Linked List is:");
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        MergeLists list1 = new MergeLists();
        list1.addToLast(new ListNode(5));
        list1.addToLast(new ListNode(10));
        list1.addToLast(new ListNode(15));
        MergeLists list2 = new MergeLists();
        list2.addToLast(new ListNode(2));
        list2.addToLast(new ListNode(4));
        list2.addToLast(new ListNode(6));
        list1.printList();
        list2.printList();
    }
}
