class Solution {
    public int kthSmallest(TreeNode root, int k) {
       if (root == null) return 0; 
        List<Integer> topK = new ArrayList<Integer>();
        helper(root, topK, k);
        return topK.get(k - 1);
    }
    private void helper(TreeNode root, List<Integer> topK, int k) {
        if (root == null) return;
        helper(root.left, topK, k);
        if (topK.size() < k) {
            topK.add(root.val);
        } else {
            return;
        }
        helper(root.right, topK, k);
    }
}
