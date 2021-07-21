package pps_8;
import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2783

public class PPS_8_10 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		float min = Float.parseFloat(st.nextToken()) / Float.parseFloat(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
	
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			float tmp = Float.parseFloat(st.nextToken()) / Float.parseFloat(st.nextToken());
			
			if (tmp < min) 
				min = tmp;
			
		}
		
		System.out.println(String.format("%.2f", min*1000));
		
	}
}
