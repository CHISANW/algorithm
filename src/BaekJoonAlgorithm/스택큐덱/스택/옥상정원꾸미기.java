package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.Scanner;

public class 옥상정원꾸미기 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        int[] building = new int[N];
        for (int i =0;i<N;i++){
            building[i] = stdIn.nextInt();
        }

        long ans = 0;
        int[] stack = new int[N];
        int stackIndex = -1;

        for (int i : building){
            while (stackIndex>=0 && stack[stackIndex] <= i){
                stackIndex--;
            }

            stack[++stackIndex]=i;
            ans+=stackIndex;
        }
        System.out.println(ans);

    }
}
