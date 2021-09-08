package queue;

import java.util.LinkedList;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10845

public class W2_bj_10845 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> q = new LinkedList<>();
		
		int N = s.nextInt();
		
		for(int i=0; i<N; i++) {
			String command = s.next();
			
			switch(command) {
				case "push":
					int num = s.nextInt();
					q.add(num);
					break;
					
				case "pop":
					if (q.isEmpty())
						System.out.println(-1);
					else
						System.out.println(q.removeFirst());
					break;
				
				case "size":
					System.out.println(q.size());
					break;
				
				case "empty":
					if (q.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
					
				case "front":
					if (q.isEmpty())
						System.out.println(-1);
					else
						System.out.println(q.getFirst());
					break;
				
				case "back":
					if (q.isEmpty())
						System.out.println(-1);
					else
						System.out.println(q.getLast());
					break;
			}
			
			
		}

	}

}
