package BaekJoonAlgorithm.스택큐덱.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr= Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] ans = new int[N];
        int[] stack = new int[N];
        int stackIndex = -1;

        for (int i =N-1;i>=0;i--){

            while (stackIndex >= 0 && stack[stackIndex]<=arr[i]){
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
