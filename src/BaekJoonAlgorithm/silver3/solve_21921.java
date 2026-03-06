package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_21921 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i =0;i<x;i++){
            sum += arr[i];
        }

        int max = sum;
        int count = 1;

        for(int i = x; i<n;i++){
            sum = sum - arr[i-x] + arr[i];

            if(sum > max){
                max = sum;
                count = 1;
            }else if(sum == max){
                count++;
            }
        }

        if(max == 0){
            System.out.println("SAD");
        }else{
            System.out.println(max);
            System.out.println(count);
        }
    }
}
