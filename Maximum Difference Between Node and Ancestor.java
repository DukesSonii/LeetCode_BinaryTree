class Solution {
    int diff = Integer.MIN_VALUE;
    void helper( TreeNode root , int min, int max){
        if(root == null ) {
            return;
        }
        int maxi = Math.max(max, root.val);
        int mini = Math.min(min, root.val);
        diff = Math.max(maxi-mini,diff);
      
        helper(root.left,mini,maxi);
        helper(root.right, mini, maxi);
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root == null) {
            return 0;
        }
        helper(root, root.val , root.val );
        return diff;
    }
}
