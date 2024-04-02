package BaekJoonAlgorithm.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 2587번 
 * 해당문제는 데이터 값이 5가지가 최대이므로 시간복잡도를 아무거나써도 해결하수 있어서 이번 문제에서는 삽입 정렬을 사용해 풀이
 */
public class 대표값2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for (int i =0;i<5;i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] =n;
        }

        //선택정렬 사용
        for (int i =0;i<arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        int sum = 0;
        for (int i : arr){
            sum+=i;
        }

        System.out.println(sum/arr.length);
        System.out.println(arr[2]);
    }
}
