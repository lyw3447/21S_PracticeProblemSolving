package pps_8;
import java.io.*;

//https://www.acmicpc.net/problem/3040

public class PPS_8_9 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result[] = new int[9];
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			result[i] = Integer.parseInt(br.readLine());
			sum += result[i];
		}
		
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if (result[i]+result[j] == sum-100) {
					
					for (int idx=0; idx<9; idx++) {
						if(idx != i && idx != j)
							System.out.println(result[idx]);
					}
				}
			}
		}
		
		
	}
}