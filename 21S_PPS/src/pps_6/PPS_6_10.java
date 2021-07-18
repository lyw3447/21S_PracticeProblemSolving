package pps_6;

import java.util.*;

public class PPS_6_10 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		HashSet<String> set = new HashSet<String>(); //HashSet is a collection of items where every item is unique
		
		String name = "";
		
		for(int i = 0; i < line.length(); i++) {
			name = "";
			
			for (int j = i; j < line.length(); j++) {
				name += line.substring(j, j+1);
				set.add(name);
			}
		}
		System.out.println(set.size());
		
	}
}
