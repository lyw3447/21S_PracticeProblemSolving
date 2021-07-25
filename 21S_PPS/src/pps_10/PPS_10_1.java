package pps_10;

import java.util.Arrays;

//https://leetcode.com/problems/invert-binary-tree/

public class PPS_10_1 {
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
	
	public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        
        return root;
    }

    public int BSTtoArray(TreeNode n, int[] results, int index) {
        if (n.left != null) {
            index = BSTtoArray(n.left, results, index);
        }

        if (n.right != null) {
            index = BSTtoArray(n.right, results, index);
        }

        results[index] = n.val;
        System.out.println(Arrays.toString(results));
        return index + 1;
    }
}
