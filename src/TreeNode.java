public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode getTree(int arr[]) {
        if (arr.length == 0) throw new RuntimeException("Empty Array!");
        TreeNode[] nodes = new TreeNode[arr.length];
        int count = 0;

        nodes[0] = new TreeNode(arr[0]);
        for (count = 1; count < arr.length; count++) {
            if (arr[count] != 0) {
                nodes[count] = new TreeNode(arr[count]);
                if (count % 2 == 1) {
                    nodes[(count + 1) / 2 - 1].left = nodes[count];
                } else {
                    nodes[(count + 1) / 2 - 1].right = nodes[count];
                }
            }
        }
        printTree(nodes);
        return nodes[0];

    }

    public static void printTree(TreeNode[] nodes) {
        for (int count = 0; count < nodes.length; count++) {
            if (nodes[count] != null)
                System.out.format("root = %d", nodes[count].val);
            else
                continue;
            if (nodes[count].left != null)
                System.out.format(", left = %d", nodes[count].left.val);
            if (nodes[count].right != null)
                System.out.format(", right = %d", nodes[count].right.val);
            System.out.println();
        }
    }

    public static void printTree(TreeNode rootNode) {
        System.out.format("root = %d", rootNode.val);
        if (rootNode.left != null)
            System.out.format(", left = %d", rootNode.left.val);

        if (rootNode.right != null)
            System.out.format(", right = %d", rootNode.right.val);

        System.out.println();
        if (rootNode.left != null)
            printTree(rootNode.left);

        if (rootNode.right != null)
            printTree(rootNode.right);

    }
}