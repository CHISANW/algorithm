package BaekJoonAlgorithm.투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제번호 1940번
 * 투포인터를 이용한 간단한 문제
 */
public class 주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;      //값옷수
        int i =0;           // min
        int j = n-1;        // max
        while (i<j){
            if (arr[i]+arr[j]<m){
                i++;
            }else if (arr[i]+arr[j]>m) j--;
            else {
                count++;
                i++; j--;
            }
        }
        System.out.println(count);
    }
}
