package BaekJoonAlgorithm.재귀호출;

import java.util.*;

public class 로또_2758 {
    static long[][] mem;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            mem  = new long[n+1][m+1];

            for (int i =0;i<n+1;i++){
                for (int j=0;j<m+1;j++){
                    mem[i][j] = -1;
                }
            }

            long result = solve(n, m);
            System.out.println(result);
        }
    }

    static long solve(int i, int last){
        if (last<=0) return 0;
        if (i==1) return last;
        if (mem[i][last]== -1){
            mem[i][last] = solve(i-1,last/2)+solve(i,last-1);
        }
        return mem[i][last];
    }
}
