import java.util.Stack;

public class Tree_TransfromLinkList {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        TreeNode currentNode = pRootOfTree;
        TreeNode  pre = null ;
        Stack<TreeNode> stack = new Stack<>();
        boolean isFirst = true;
        while (!stack.isEmpty() || currentNode != null) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            if (isFirst) {
                pRootOfTree = currentNode;
                pre = currentNode;
                isFirst = false;
            } else {
                pre.right = currentNode;
                currentNode.left = pre;
                pre = currentNode;
            }
            currentNode = currentNode.right;
        }
        return pRootOfTree;
    }
}
