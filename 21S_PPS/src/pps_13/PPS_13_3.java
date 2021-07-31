package pps_13;
import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/16435

public class PPS_13_3 {
	public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_FRUIT = Integer.parseInt(st.nextToken());
        int snakeLength = Integer.parseInt(st.nextToken());
        int fruit[] = new int [NUMBER_OF_FRUIT];
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<NUMBER_OF_FRUIT;i++) {
            fruit[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(fruit);
        
        for(int i=0;i<NUMBER_OF_FRUIT;i++) {
            if(fruit[i] <= snakeLength) {
                snakeLength++;
            }else {
                break;
            }
        }
        sb.append(snakeLength);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

}
