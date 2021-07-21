package pps_8;
import java.io.*;
//https://www.acmicpc.net/problem/15552

public class PPS_8_8 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int target = str.indexOf(" ");
			sb.append(Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target+1))).append('\n');
		}
		br.close();
		System.out.println(sb);
	}

}
