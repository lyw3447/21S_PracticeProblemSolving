package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class W2_bj_1158 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int K = s.nextInt();
		
		for(int i=1; i<=N; i++) q.add(i);
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		while(q.size() > 1) {
			for(int i=0; i<K-1; i++) {
				int val = q.poll();	//queue의 앞 원소 가져오기
				q.offer(val);	//queue의 끝에 다시 붙여넣기
			}
			
			sb.append(q.poll()).append(", ");
		}
		
		sb.append(q.poll()).append(">");	//제일 마지막 남은 원소 출력
		System.out.println(sb);
	}

}
