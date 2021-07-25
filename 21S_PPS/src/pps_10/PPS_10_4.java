package pps_10;

//https://programmers.co.kr/learn/courses/30/lessons/12943

public class PPS_10_4 {
	public int solution(long num) {
	      int answer = 0;
	      
	      while(num!=1) {
	          if(num%2==0) {
	              num /= 2;
	          } else {
	              num = 3*num + 1;
	          }
	          
	          answer++;
	          if(answer==500) {
	              answer=-1; break;
	          }
	      }
	      return answer;
	  }
}
