package pps_12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//acmicpc.net/problem/4150

public class PPS_12_6 {
	public static void main(String[] args) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println(fib(Integer.parseInt(br.readLine())));
 
    }
 
    public static BigInteger fib(int n) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c ;
        for (int j=2 ; j <= n ; j++) {
            c =  a.add(b);
            a = b;
            b = c;
        }
 
        return (a);
    }
    
}
