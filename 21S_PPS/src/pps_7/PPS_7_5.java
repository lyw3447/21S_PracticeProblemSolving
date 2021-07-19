package pps_7;
import java.util.*;

public class PPS_7_5 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}
