import java.util.ArrayList;

public class Tree_FindPath {
    ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (target < 0 || root == null) return new ArrayList<>(); //不能返回null
        list.add(root.val);
        if (root.left == null && root.right == null && target == root.val) {
            listAll.add(new ArrayList<>(list)); // 容易出错的地方
        }
        FindPath(root.left, target - root.val);
        FindPath(root.right, target - root.val);
        list.remove(list.size() - 1);
        return listAll;
    }

    public void test() {
        TreeNode tree = TreeNode.getTree(new int[]{1, 2 , 3});
        ArrayList<ArrayList<Integer>> result = FindPath(tree, 3);
        System.out.println(result);
    }

}
