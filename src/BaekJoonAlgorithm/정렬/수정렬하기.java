package BaekJoonAlgorithm.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 2750번
 * 이문제는 시간복잡도가 아떤 종류가 나와도 해결할수있다. 버블정렬 O(n제곱) 이여도 충분하다
 * 그래서 구현하기 쉬운 버블정렬로 오름차순으로 정렬해서 풀었다.
 */
public class 수정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }

        for (int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
