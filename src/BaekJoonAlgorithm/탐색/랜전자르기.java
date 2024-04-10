package BaekJoonAlgorithm.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 1654번 랜선 자르기
 * 이분탐색을 활용해 문제 풀이
 */
public class 랜전자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];

        long max = 0;

        for(int i =0; i<k;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if (max<arr[i]){
                max = arr[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while (min<max){
            mid=(max+min)/2;

            long count = 0;

            for (int i =0;i<arr.length;i++){
                count+= (arr[i]/mid);
            }

            if (count<n){
                max = mid;
            }else min  = mid +1;
        }

        System.out.println(min -1);

    }
}
