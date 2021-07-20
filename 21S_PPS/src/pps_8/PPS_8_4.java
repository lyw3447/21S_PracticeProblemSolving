package pps_8;
import java.util.*;

//https://leetcode.com/problems/binary-search/
// O(log n)

public class PPS_8_4 {
	public static void main(String[] args) throws Exception{
		int nums[] =  {-1, 0, 3, 5, 9, 12}; //4
		int target = 9;
		int left = 0;
        int right = nums.length-1;
		int pivot;
		
		while(left <= right) {
            pivot = (left+right)/2;
            if(nums[pivot] == target) {
                System.out.println(pivot);
                break;
            }
            if(nums[pivot] < target)
                left = pivot+1;
            else
                right = pivot-1;
		}
		if(left > right)
			System.out.println(-1);
	}
}
