package pps_7;
import java.util.*;

public class PPS_7_4 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		int size = line.length();
		String[] arr = new String[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = line.substring(i, size);
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
	}

}
