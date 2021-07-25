package pps_9;

//https://leetcode.com/problems/balanced-binary-tree/

public class PPS_9_3 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public boolean isBalanced(TreeNode root) {
	      
        if(helper(root)==999) return false;
        return true;
    }
    
    public int helper(TreeNode node){
        
        int left=0,right=0;
        
        if(node==null){
            return 0;
        }
        
        left = helper(node.left)+1;
        right = helper(node.right)+1;
        
        if(left==1000||right==1000){
            return 999;
        }
        
        if(Math.abs(left-right)>1){
            return 999;
        }
        
        return Math.max(left,right);
        
    }
	

}
