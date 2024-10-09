package BaekJoonAlgorithm.트리;

import java.io.*;
import java.util.*;

public class 부동산다툼 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        HashSet<Integer> owned = new HashSet<>();

        for(int i=1;i<=q;i++){
            int nowGoal = Integer.parseInt(br.readLine());
            int blockedNum = 0;
            for(int tmp=nowGoal;tmp>=2;tmp/=2) if(owned.contains(tmp)) blockedNum = tmp;
            System.out.println(blockedNum);
            if(blockedNum==0) owned.add(nowGoal);
        }
    }
}
