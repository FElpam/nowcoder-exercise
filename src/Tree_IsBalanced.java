public class Tree_IsBalanced {
    boolean isBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }

    public int getDepth(TreeNode root) {
        if (root == null || isBalanced != true) return 0;
        int leftDep = getDepth(root.left);
        int rightDep = getDepth(root.right);
        if (Math.abs(leftDep - rightDep) > 1) {
            isBalanced = false;
        }
        return leftDep > rightDep ? leftDep + 1 : rightDep + 1;
    }

    public void test() {
        TreeNode tree = TreeNode.getTree(new int[]{3,2,0,1,0,0,0});
        System.out.println(IsBalanced_Solution(tree));
    }
}
