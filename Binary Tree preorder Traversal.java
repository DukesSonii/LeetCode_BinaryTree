
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        recursivePreorderTraversal(root, result);
        return result;
    }
    void recursivePreorderTraversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            recursivePreorderTraversal(root.left, result);
            recursivePreorderTraversal(root.right, result);
        }
    }
    
}
