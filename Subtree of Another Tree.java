
class Solution {
   public boolean isSubtree(TreeNode node, TreeNode subroot) {
        if (node == null && subroot == null) {
            return true;
        }
        if (node == null) {
            return false;
        }
       
        if(node.val == subroot.val){
            if(isidentical(node, subroot)) {
                return true;
            }
        } 
        return isSubtree(node.left, subroot) || isSubtree(node.right, subroot);
    }

    
    public boolean isidentical(TreeNode node, TreeNode subroot) {
        if (node == null && subroot == null) {
            return true;
        }
        if (node == null || subroot == null || node.val != subroot.val) {
            return false;
        }
        
        if(!isidentical(node.left, subroot.left)){
            return false;
        }
        
        //check for non identical in right subtree
        if(!isidentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }
}
