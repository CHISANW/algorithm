package BaekJoonAlgorithm.재귀호출;

import java.util.Scanner;

public class 차이를최대로 {
    static int result = Integer.MIN_VALUE;
    static int N;
    static int[] A, selected;
    static boolean[] check;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        A= new int[N];
        selected = new int[N];
        check = new boolean[N];
        for (int i =0;i<N;i++){
            A[i]= sc.nextInt();
        }

        dfs(0);
        System.out.println(result);
    }

    static void dfs(int index){
        if (index==N){
            result = Math.max(result,getResult());
            return;
        }

        for (int i =0;i<N;i++){
            if (!check[i]){
                check[i]=true;
                selected[index] = A[i];
                dfs(index+1);
                check[i]=false;
            }
        }
    }
    static int getResult(){
        int sum =0;
        for (int i =0;i<N-1;i++){
            sum += Math.abs(selected[i]-selected[i+1]);
        }
        return sum;
    }
}
