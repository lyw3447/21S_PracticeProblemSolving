package pps_7;
import java.util.*;

public class PPS_7_1 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[][] arr = new String[n][2];
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() { //new Comparator는 원하는대로 정렬 조건설정할 때 사용
			@Override
			public int compare(String[] s1, String[] s2) { //나이순으로 정렬
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]); //s1나이가 많으면 뒤로. 적으면 앞으로?
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
	
}
