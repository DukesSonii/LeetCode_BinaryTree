class Solution {
public:
    
vector<vector<int>> ans; 
void solve(TreeNode* root, vector<int>& path, int targetSum,int currSum){
    if (!root)
        return;
    currSum+=root->val;
    path.push_back(root->val) ;
    if(currSum==targetSum and !root->left and !root->right){    //!root.left means      //left and right child being null as its a valid path
        ans. push_back(path);
    }
    //now traverse back to left and right one when we are passing the cuurent sum means we are holding valyue of current root node also
        solve(root->left, path, targetSum,currSum);
        solve(root->right, path, targetSum,currSum);
        path.pop_back();    //5+4+11+7 then pop 7 and go to right child i.e 2 
}
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        vector<int> path;   //null path not containing any node val
        solve(root, path, targetSum, 0);
        return ans;
    }
};

 



