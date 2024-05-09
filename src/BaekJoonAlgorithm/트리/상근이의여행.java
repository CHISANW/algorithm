package BaekJoonAlgorithm.트리;

import java.util.*;
import java.io.*;

public class 상근이의여행 {
    public static void main(String[] args)throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(t-- >0) {
            st= new StringTokenizer(br.readLine()," ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            for (int i =0;i<n;i++) {
                st = new StringTokenizer(br.readLine(), " ");
            }

            System.out.println(n - 1);
        }
    }
}
