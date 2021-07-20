package pps_8;
import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/49995?language=java

public class PPS_8_1 {
	public static void main(String[] args) throws Exception{
		int cookie[] = {1, 1, 2, 3}; //3
		int leftSum, leftIdx;
        int rightSum, rightIdx;
        int answer = 0;
        
        for(int i = 0; i < cookie.length-1; i++) {   
            leftSum =cookie[i];
            leftIdx = i;
            rightSum =cookie[i+1];
            rightIdx = i+1; 
            
            while(true) {
                if(leftSum == rightSum && answer < leftSum) {
                    answer = leftSum;
                }
                if(leftIdx > 0 && leftSum <= rightSum) {
                    leftIdx--;
                    leftSum += cookie[leftIdx];
                }else if(rightIdx < cookie.length-1 && leftSum >= rightSum) {
                    rightIdx++;
                    rightSum += cookie[rightIdx];
                }else {
                    break;
                }
            }
        }
        System.out.println(answer);
	}
}
