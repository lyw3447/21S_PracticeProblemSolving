package pps_6;
import java.util.*;

public class PPS_6_5 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Set<Integer> set = new TreeSet<Integer>();
		while(n-->0) {
			set.add(sc.nextInt());
		}
		
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	

}
