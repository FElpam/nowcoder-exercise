/*
    输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序
    遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列
    {4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

public class Tree_Rebuild {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        // Bug：pre.length 和 in.length 忘记 -1 了
        return reConstructBinaryTree(pre, 0, pre.length - 1,
                in, 0, in.length - 1);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int headPre, int tailPre,
                                           int[] in, int headIn, int tailIn) {
        if (headPre > tailPre || headIn > tailIn) return null;
        TreeNode root = new TreeNode(pre[headPre]);
        for (int i = headIn; i <= tailIn; i++) {
            if (in[i] == root.val) {
                int leftSize = i - headIn;
                int rightSize = tailIn - i ;
                root.left = reConstructBinaryTree(
                        pre, headPre + 1, headPre + leftSize,
                        in, headIn, i - 1);
                root.right = reConstructBinaryTree(
                        pre, tailPre - rightSize + 1, tailPre,
                        in, i + 1, tailIn);
                break;
            }
        }
        return root;
    }
}
