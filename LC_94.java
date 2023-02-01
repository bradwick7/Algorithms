import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC_94 {

    public static class BinaryTree {
        TreeNode root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(4);
        tree.root.right = new TreeNode(2);
        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(3);
        List<Integer> list = inorderTraversal(tree.root);
        System.out.println(list);
    }
}
