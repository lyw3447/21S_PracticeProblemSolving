package pps_12;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pancake-sorting/

public class PPS_12_8 {
	public List<Integer> pancakeSort(int[] A) {
        List<Integer> ans = new ArrayList<>();
        if (A == null || A.length == 0) return ans;
        int n = A.length;
        for (int end = n - 1; end > 0; end--) {
            int maxVal = A[0], maxIndex = 0;
            for (int i = 1; i <= end; i++) {
                if (A[i] >= maxVal) {
                    maxVal = A[i];
                    maxIndex = i;
                }
            }
            if (maxIndex == end) continue;
            reverse(A, maxIndex + 1);
            ans.add(maxIndex + 1);
            reverse(A, end + 1);
            ans.add(end + 1);
        }
        return ans;
    }
    
    private void reverse(int[] A, int k) {
        int i = 0, j = k - 1;
        while (i < j) {
            swap(A, i++, j--);
        }
    }
    
    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
