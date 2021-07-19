package pps_7;
import java.util.*;

public class PPS_7_3 {
	public static void main(String[] args) throws Exception{
		Integer nums[] = {3,2,3};
		
		int n = nums.length/2;   
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]) + 1;
                if(count > n) System.out.println(nums[i]);
                else map.replace(nums[i], count);
            }else{
                map.put(nums[i], 1);
            }
        }
     
        System.out.println(nums[0]);	
		
	}
}
