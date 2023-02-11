class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        int left =0;
        int right = nums.size()-1;
        while(left<right) {
            if(nums.get(right) + nums.get(left) == k){
                return true;
            }
            if(nums.get(left) + nums.get(right) < k) {
                left++;
            }
            else { 
                right--; 
            }
        }
        return false;
    }
    
    public void inorder(TreeNode root, List<Integer> nums){
        if(root == null)return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
}
