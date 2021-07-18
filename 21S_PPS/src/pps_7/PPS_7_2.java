package pps_7;
import java.util.*;

public class PPS_7_2 {
	static String numToString[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int size = end-start+1;
		Node node[] = new Node[size]; 
		
		for(int i=0; i<size; i++) {
			node[i] = new Node(start++);
		}
		
		Arrays.sort(node);
		
		for(int i=0; i<size; i++) {
			if(i != 0 && i%10 == 0) System.out.println();
			System.out.print(node[i].num + " ");
		}
			
	}
	
	static class Node implements Comparable<Node>{
		int num = 0;
		String numToStr = "";
		
		public Node(int num) {
			super();
			this.num = num;
			int num10 = num/10; //10의 자리수 
			int num1 = num%10; //1의 자리수 
			
			if(num >= 10) {
				numToStr = numToString[num10] + " " + numToString[num1];
			}
			else {
				numToStr = numToString[num1];
			}
		}
		
		@Override
		public int compareTo(Node o) {
			return this.numToStr.compareTo(o.numToStr);
		}
	}
	
}
