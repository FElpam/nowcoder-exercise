public class Tree_Mirror {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode pointer = root.left;
        root.left = root.right;
        root.right = pointer;
        if (root.left != null) Mirror(root.left);
        if (root.right != null) Mirror(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 0, 6};
        TreeNode rootNode = TreeNode.getTree(arr);
        new Tree_Mirror().Mirror(rootNode);
        TreeNode.printTree(rootNode);
    }
}
