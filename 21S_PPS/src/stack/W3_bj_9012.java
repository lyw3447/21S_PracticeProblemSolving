package stack;

import java.util.Scanner;
import java.util.Stack;

//https://www.acmicpc.net/problem/9012
public class W3_bj_9012 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		
		for (int i=0; i<T; i++) {
			String line = s.next();
			Stack<Integer> stack = new Stack<Integer>();
			
			for (int j=0; j<line.length(); j++) {
				if (line.charAt(j) == '(') stack.push(1);
			
				else {
					if (!stack.empty()) stack.pop();
					else {
						System.out.println("NO");
						break;
					}
				}
				if (j == line.length()-1 && stack.empty())
					System.out.println("YES");
				else if(j == line.length()-1)
					System.out.println("NO");
			}
		}

	}

}
