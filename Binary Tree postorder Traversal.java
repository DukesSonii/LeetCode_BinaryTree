
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        recursivePreorderTraversal(root, result);
        return result;
    }
    void recursivePreorderTraversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            recursivePreorderTraversal(root.left, result);
            recursivePreorderTraversal(root.right, result);
            result.add(root.val);
        }
    }
    
}
