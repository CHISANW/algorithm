package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.Scanner;

public class 스택수열 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = stdIn.nextInt();

        int[] arr = new int[N];
        for (int i =0;i<N;i++){
            arr[i] = stdIn.nextInt();
        }

        int[] stack = new int[N];
        int stackIndex = -1;
        int stackNumber = 1;


        for (int x : arr){
            //arr 배열에서 현재 값이 stack값보다 작다면 스택에 값을 삽입
            while (stackNumber<=x){
                stack[++stackIndex] = stackNumber++;
                sb.append("+\n");
            }

            // 스택의 값이 비어있거나 일치하지 않을때 실패
            if (stackIndex < 0 || stack[stackIndex]!=x){
                sb.setLength(0);
                sb.append("NO");
                break;
            }
            sb.append("-\n");
            --stackIndex;
        }
        System.out.println(sb);
    }
}
