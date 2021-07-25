package pps_10;

import java.math.BigInteger;

//https://programmers.co.kr/learn/courses/30/lessons/62048

public class PPS_10_7 {
	public long solution(int w, int h) {
	    int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
	    
	    return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
	  }
}
