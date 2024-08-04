package BaekJoonAlgorithm.수학;

import java.io.*;
import java.util.*;

public class 터렛 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while(t-- > 0){
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int t1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());

            int answer = calculator(x1,y1,t1,x2,y2,t2);
            System.out.println(answer);

        }
    }

    static int calculator(int x1, int y1, int t1, int x2, int y2, int t2){

        int distance =  (int)(Math.pow(x2-x1 ,2) + Math.pow(y2-y1, 2));

        if (x1==x2 && y1 == y2 && t1==t2){
            return -1;
        }
        else if (distance >Math.pow(t1 + t2,2)){
            return 0;
        } else if (distance < Math.pow(t2-t1,2)){
            return 0;
        }
        else if (distance == Math.pow(t2-t1,2)){
            return 1;
        }
        else if (distance == Math.pow(t2+t1,2)){
            return 1;
        }
        else
            return 2;
    }
}
