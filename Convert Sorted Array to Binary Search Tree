class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
			return null;
		return createBST(nums, 0, nums.length - 1);
    }
    
    public static TreeNode createBST(int arr[], int st, int end ){
        if (st>end)
        {    //invalid
            return null;
        }    
        int mid = (st+end) / 2;
        TreeNode root = new TreeNode (arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
      
}
