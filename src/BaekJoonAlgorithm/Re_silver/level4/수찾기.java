package BaekJoonAlgorithm.Re_silver.level4;

import java.io.*;
import java.util.*;

public class 수찾기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Long> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            set.add(Long.parseLong(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<m;i++){
            if(set.contains(Long.parseLong(st.nextToken()))){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);

    }
}
