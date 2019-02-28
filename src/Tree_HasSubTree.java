public class Tree_HasSubTree {
    // 负责将需要比较的根结点不断下移
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return isSubTree(root1.left, root2)
                || isSubTree(root1.right, root2)
                || isSubTree(root1, root2);
    }

    // 从两个根结点出发判断下面的内容是否同构
    public boolean isSubTree(TreeNode root1,TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val == root2.val) {
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }
        return false;
    }
}
