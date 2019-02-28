import java.util.ArrayList;

public class Tree_BFS {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<TreeNode> treeList = new ArrayList<>();
        resultList.add(root.val);
        treeList.add(root);
        for (int i = 0; i < resultList.size(); i ++) {
            TreeNode currentNode = treeList.get(i);
            if (currentNode.left != null) {
                treeList.add(currentNode.left);
                resultList.add(currentNode.left.val);
            }
            if (currentNode.right != null) {
                treeList.add(currentNode.right);
                resultList.add(currentNode.right.val);
            }
        }
        return resultList;
    }
}
