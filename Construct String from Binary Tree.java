class Solution {
    public String tree2str(TreeNode t) {
        StringBuilder ans = new StringBuilder();
        tree(ans, t);
        return ans.toString();
    }

    public void tree(StringBuilder ans, TreeNode t) {
        if (t == null) {
            return;
        }
        ans.append(t.val);
        if (t.right != null) {
            // if the right child isn't empty, we still need to append '()' although            the left child is empty
            
            tree(ans.append('('), t.left);
            ans.append(')');
            tree(ans.append('('), t.right);
            ans.append(')');
        }
        else if (t.left != null) {
            tree(ans.append('('), t.left);
            ans.append(')');
        }
    }
}
