package stack;

import java.util.Scanner;
import java.util.Stack;

//https://www.acmicpc.net/problem/10773

public class W3_bj_10773 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		int N = s.nextInt();
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			int curNum = s.nextInt();
			
			if (curNum != 0) {
				sum += curNum;
				stack.push(curNum);
			}
			else if (i > 0 && curNum == 0) {
				sum -= stack.peek();
				stack.pop();
			}
		}
		System.out.println(sum);

	}
}
