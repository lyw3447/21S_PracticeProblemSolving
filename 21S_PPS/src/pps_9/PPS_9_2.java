package pps_9;


//https://leetcode.com/problems/diameter-of-binary-tree/

public class PPS_9_2 {
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	 int ans=1;
	    public int diameterOfBinaryTree(TreeNode root) {
	        goDeep(root);

	        return ans-1;
	    }
	    private int goDeep(TreeNode root){
	        if(root==null)return 0;

	        int left = goDeep(root.left);
	        int right = goDeep(root.right);
	        
	        ans = Math.max(ans,1+left+right);
	        
	        return Math.max(left,right)+1;
	    }
}
