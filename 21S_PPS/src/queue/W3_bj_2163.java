package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2164
public class W3_bj_2163 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		int N = s.nextInt();
		
		for(int i=1; i<N+1; i++) q.add(i);
		
		while(q.size() > 1) {
			q.remove();	//첫번째 값 삭제
			
			int num = q.poll();
			q.add(num);	//제일 뒤로 카드 집어넣기
		}
		System.out.println(q.poll());
	}
}
