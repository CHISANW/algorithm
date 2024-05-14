package BaekJoonAlgorithm.재귀호출;

import java.util.*;

public class 원투쓰리더하기 {
    static int[] arr = {1,2,3};
    static int limit, count = 0;


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            limit = sc.nextInt();
            count = 0;
            solve(0);
            System.out.println(count);
        }

        String s = "1";

        StringTokenizer st = new StringTokenizer("aaa"," ");

    }

    static void solve(int sum){
        if(sum==limit) count++;
        else if (sum>limit) return;

        for(int i =0;i<3;i++){
            int resum = sum;
            resum +=arr[i];
            solve(resum);
        }
    }
}
