package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solve_13423 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i =0; i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            long result = 0;

            for(int i =1 ; i<n-1;i++){
                int target = 2 * arr[i];
                int start = 0;
                int end = n-1;

                while (start < i && i < end){
                    int sum = arr[start] + arr[end];

                    if(sum < target){
                        start++;
                    }else if(sum > target){
                        end--;
                    }else{
                        result++;
                        start++;
                        end--;
                    }
                }
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
