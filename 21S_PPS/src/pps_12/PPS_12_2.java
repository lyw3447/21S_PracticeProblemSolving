package pps_12;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/

public class PPS_12_2 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}
