package BaekJoonAlgorithm.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 2798번
 */
public class 블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int search = search(arr, n, m);

        System.out.println(search);

    }

    static int search(int[] arr, int n, int m){

        int max=0;
        for (int i =0;i<n;i++){
            for (int k=i+1;k<n;k++){
                for (int j =k+1;j<n;j++){
                    if (arr[i]+arr[k]+arr[j]<=m){
                        if (max<arr[i]+arr[k]+arr[j])
                            max = arr[i] + arr[k] + arr[j];
                        }
                    }
                }
            }
        return max;
    }
}
