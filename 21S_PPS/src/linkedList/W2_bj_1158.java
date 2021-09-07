package linkedList;
import java.util.*;

//https://www.acmicpc.net/problem/1158
		//BJ 요세푸스

public class W2_bj_1158 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		
		// N K 입력받아 변수에 저장
		int N = s.nextInt();
		int K = s.nextInt();
		
		// 1~N까지 linked list에 저장 
		for(int i=1; i<=N; i++) list.add(i);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int index = 0;
		
		// 아무것도 안남을때까지 반복
		while(list.size() > 1) {
			// K번째 숫자 삭제, 출력
			index = (index + (K - 1)) % list.size();
			sb.append(list.remove(index)).append(", ");
		}
		sb.append(list.remove()).append(">");
		System.out.println(sb);
	}

}
