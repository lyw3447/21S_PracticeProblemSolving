package pps_8;
import java.util.*;

//https://leetcode.com/problems/search-insert-position/
public class PPS_8_5 {
	public static void main(String[] args) throws Exception{
		int nums[] = {1, 3, 5, 6};
		int target = 7;
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
			System.out.println(left);
	}
}
