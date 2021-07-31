package pps_13;

import java.util.Scanner;

//https://www.acmicpc.net/problem/11047

public class PPS_13_1 {
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		
		int[] coin = new int[N];
		
		for(int i = 0; i < N; i++) {
			coin[i] = in.nextInt();
		}
		
		int count = 0;
 
		for (int i = N - 1; i >= 0; i--) {
			if(coin[i] <= K) {
				count += (K / coin[i]);
				K = K % coin[i];
			}
		}
		System.out.println(count);
	}
}
