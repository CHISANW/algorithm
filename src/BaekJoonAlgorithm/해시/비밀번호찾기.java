package BaekJoonAlgorithm.해시;

import java.io.*;
import java.util.*;


public class 비밀번호찾기 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String,String> site = new HashMap<>();

        for(int i =0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();
            site.put(key,value);
        }

        for(int i =0;i<m;i++){
            String vlaue = br.readLine();
            sb.append(site.get(vlaue)+"\n");
        }

        System.out.println(sb);

    }
}
