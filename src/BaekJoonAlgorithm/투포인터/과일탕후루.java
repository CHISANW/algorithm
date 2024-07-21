package BaekJoonAlgorithm.투포인터;

import java.io.*;
import java.util.*;

public class 과일탕후루 {
    static BufferedReader br;
    static int n;
    static int[] arr;
    static int[] nums  = new int[10];

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int index = 0;
        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        sb.append(twoPoint(0,0,0,0,0));

        System.out.println(sb);
    }

    static int twoPoint(int left, int right, int cnt, int kind, int max){
        if(right >= n){
            return max;
        }

        if(nums[arr[right]] == 0){
            kind++;
        }
        cnt++;
        nums[arr[right]]++;

        if(kind > 2){
            if( --nums[arr[left]] == 0){
                kind--;
            }
            cnt--;
            left++;
        }

        max = Math.max(max,cnt);
        return twoPoint(left,right+1,cnt, kind,max);
    }

}
