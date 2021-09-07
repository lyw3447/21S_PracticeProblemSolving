package queue;

import java.util.*;

//https://www.acmicpc.net/problem/1158
//BJ 요세푸스

public class W2_bj_1158 {
	public void main(String[] args)throws Exception {
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		
		// N K 입력받아 변수에 저장
		int N = s.nextInt();
		int K = s.nextInt();
		
		// 1~N까지 linked list에 저장 
		for(int i=1; i<=N; i++) list.add(i);
		
		System.out.print("<");
		
		// 아무것도 안남을때까지 반복
		for(int i=0; i<N-1; i++) {
			// K번째 숫자 삭제, 출력
			System.out.print(list.remove((i+(K-1))%list.size()) + ", ");
		}
		System.out.print(list.remove() + ">");
		
	}
}
