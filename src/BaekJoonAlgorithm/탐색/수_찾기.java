package BaekJoonAlgorithm.탐색;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제번호 1920번 수찾기
 * 이진탐색으로 문제풀이 Arrays.sort를 통해 배열을 정렬 시간복잡도는 O(nlogn)
 */
public class 수_찾기 {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int[] a= new int[N];
        for (int i =0; i<N;i++){
          a[i]= stdIn.nextInt();
        }

        Arrays.sort(a);

        int M = stdIn.nextInt();

        for (int i = 0;i<M;i++){
            boolean find =false;
            int target=stdIn.nextInt();
            int start = 0;
            int end = a.length-1;

            while (start<=end){
                int mid_index =(start+end)/2;
                int mid_value = a[mid_index];
                if (mid_value>target){
                    end = mid_index-1;
                } else if (mid_value<target) {
                    start = mid_index+1;
                }else{
                    find =true;
                    break;
                }
            }
            if (find) System.out.println(1);
            else System.out.println(0);
        }
    }
}