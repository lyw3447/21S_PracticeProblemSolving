package pps_10;

//https://programmers.co.kr/learn/courses/30/lessons/12901

public class PPS_10_5 {
	public static String solution(int a, int b) {
        String answer = "";
        
        int _31 = 31;
        int _30 = 30;
        int _28 = 28;
        int yoon = 29;
        int day = 0; 
        int month[] = {_31,yoon,_31,_30,_31,_30,_31,_31,_30,_31,_30,_31};
        String[] yoEil = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        
        for(int i =0; i<a-1; i++) {
            day+=month[i];
        }
        
        day+=b;
        answer = yoEil[(day%7)];
        
        return answer;
  }
}
