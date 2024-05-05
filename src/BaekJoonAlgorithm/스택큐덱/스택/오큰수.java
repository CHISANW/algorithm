package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 오큰수 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        int[] arr= new int[N];
        for (int i =0;i<N;i++){
            arr[i] = stdIn.nextInt();
        }

        int[] ans = new int[N];
        int[] stack = new int[N];
        int stackIndex = -1;

        for (int i =N-1;i>=0;i--){

            while (stackIndex > 0 && stack[stackIndex]<=arr[i]){
                stackIndex--;
            }
            ans[i] = (stackIndex >= 0 ? stack[stackIndex]: -1);
            stack[++stackIndex] = arr[i];
        }

        System.out.println(Arrays.stream(ans)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
