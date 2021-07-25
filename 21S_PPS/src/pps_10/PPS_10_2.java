package pps_10;
import java.util.*;

//https://leetcode.com/problems/increasing-order-search-tree/

public class PPS_10_2 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	List<Integer> list = new ArrayList<>();
    
    public TreeNode increasingBST(TreeNode root) {
        DFS(root);
        Collections.sort(list);
        
        TreeNode node = new TreeNode(list.get(0));
        list.remove(0);
        makeTree(node, 0);
        return node;
    }
    
    public void makeTree(TreeNode root, int index){
        if(index==list.size()) return;
        TreeNode node = new TreeNode(list.get(index));
        root.right = node;
        makeTree(root.right,index+1);
    }
     
    public void DFS(TreeNode root){
        if(root==null) return;
        else list.add(root.val);
        
        if(root.left!=null) DFS(root.left);
        if(root.right!=null) DFS(root.right);
    }
}
