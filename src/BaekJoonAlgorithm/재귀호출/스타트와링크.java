package BaekJoonAlgorithm.재귀호출;

import javax.print.DocFlavor;
import java.util.Scanner;

public class 스타트와링크 {
    static int[][] team;
    static int N;
    static boolean[] check;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        check = new boolean[N+1];
        team = new int[N+1][N+1];

        for (int i =1;i<=N;i++){
            for (int j=1;j<=N;j++){
                team[i][j] = sc.nextInt();
            }
        }

        solve(0,1);
        System.out.println(min);
    }

    static void solve(int dep, int start){
        //base case
        if (N/2==dep){
            min = Math.min(min,getResult());
            return;
        }

        for (int i =start;i<=N;i++){
            check[i]= true;
            solve(dep+1,i+1);
            check[i]= false;
        }
    }

    static int getResult(){
        int start = 0;
        int link = 0;

        for (int i =1;i<=N;i++){
            for (int j = 1;j<=N;j++){
                if (i==j) continue;
                if (check[i] && check[j]) start += team[i][j];
                if (!check[i] && !check[j]) link += team[i][j];
            }
        }
        return Math.abs(start-link);
    }
}
