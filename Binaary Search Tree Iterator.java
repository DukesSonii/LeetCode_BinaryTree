class BSTIterator {
    TreeNode root;
    Stack<TreeNode> treeNodeStack;
    
    public BSTIterator(TreeNode root) {
        this.root = root;
        this.treeNodeStack = new Stack();
        this.buildTreeNodeStack();
    }
    
    public int next() {
        TreeNode result = treeNodeStack.pop();
        if (result.right != null) {
            TreeNode node = result.right;
            buildTreeNodeStack(node);
        }
        return result.val;
    }
    
    public boolean hasNext() {
        return !treeNodeStack.isEmpty();
    }
    
    private void buildTreeNodeStack() { 
        TreeNode currentNode = root;
        buildTreeNodeStack(currentNode);
    }    
    
    private void buildTreeNodeStack(TreeNode node) {
        while (node != null) {
            treeNodeStack.push(node);
            node = node.left;
        }
    }
}
