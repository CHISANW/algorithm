package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solve_9237 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            tree[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tree);
        reverse(tree);

        int maxDay = 0;

        for(int i =0; i<n;i++){
            int finishDay = (i+1) + tree[i];
            maxDay = Math.max(maxDay, finishDay);
        }
        System.out.println(maxDay+1);
    }

    private static void reverse(int[] arr){
        for(int i =0; i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
