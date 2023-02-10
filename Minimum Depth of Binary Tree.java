class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null){
            return Math.min(Integer.MAX_VALUE, minDepth(root.right)) + 1;
        }
        else if(root.right == null){
            return Math.min(minDepth(root.left), Integer.MAX_VALUE) + 1;
        }
        else
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
