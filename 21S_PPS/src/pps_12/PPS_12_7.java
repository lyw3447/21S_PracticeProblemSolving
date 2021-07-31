package pps_12;

import java.util.Arrays;

//https://leetcode.com/problems/wiggle-sort-ii/

public class PPS_12_7 {
	public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        
        int[] answer = new int[nums.length];     
        int length = nums.length / 2;
        
        if(nums.length % 2 == 1){
            length = length+1;
        }
        for(int i=0; i< length; i++){
            answer[2*i] = nums[length-i-1];
        }
        for(int i=0; i< nums.length/2; i++){
            answer[2*i+1] = nums[nums.length-i-1];
        }
        for(int i=0; i< nums.length; i++){
            nums[i] = answer[i];
        }
    } 
}
