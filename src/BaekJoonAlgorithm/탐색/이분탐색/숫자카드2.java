package BaekJoonAlgorithm.탐색.이분탐색;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        while (m-- >0){
            int x = Integer.parseInt(st.nextToken());

            int lowerBoundIndex = findLowerBoundIndex(arr, x);

            int upperBoundIndex = findUpperBoundIndex(arr, x);

            bw.write(upperBoundIndex-lowerBoundIndex+ " ");
        }
        bw.flush();
        bw.close();
    }

    private static int findUpperBoundIndex(int[] arr, int x) {
        int upperBoundIndex = arr.length;
        int l =0, r=arr.length-1;

        while (l<=r){
            int m = (l+r)/2;
            if (arr[m]<=x) l = m+1;
            else {
                r= m-1;
                upperBoundIndex = m;
            }
        }
        return upperBoundIndex;
    }

    private static int findLowerBoundIndex(int[] arr, int x) {
        int lowerBoundIndex = arr.length;
        int l =0, r=arr.length-1;

        while (l<=r){
            int m = (l+r)/2;

            if (arr[m]<x) l = m+1;
            else{
                r = m-1;
                lowerBoundIndex = m;
            }
        }
        return lowerBoundIndex;
    }
}
