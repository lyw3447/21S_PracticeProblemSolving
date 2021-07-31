package pps_13;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1541

public class PPS_13_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = Integer.MAX_VALUE;
		String[] subtraction = in.nextLine().split("-");
		
		for(int i = 0; i < subtraction.length; i++) {
			int temp = 0;
 
			String[] addition = subtraction[i].split("\\+");
			
			for(int j = 0; j < addition.length; j++) {
				temp += Integer.parseInt(addition[j]);
			}

			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
	
}
