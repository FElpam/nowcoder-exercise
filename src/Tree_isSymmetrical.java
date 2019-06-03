public class Tree_isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) return true;
        if (pRoot.left == null && pRoot.right == null) return true;
        if (pRoot.left == null || pRoot.right == null) return false;
        if (pRoot.left.val != pRoot.right.val) return false;
        return isSymmetrical(pRoot.left) && isSymmetrical(pRoot.right);
    }
}
