package BaekJoonAlgorithm.정렬;

import java.util.Scanner;

/**
 * 문제 1427번
 * 간단한 삽입 정렬로 풀이 해당 문제는 시간복작도를 어느것을 사용해도 풀수있다.
 */
public class 소트인사이드 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String str = stdIn.next();

        int[] a= new int[str.length()];
        for (int i=0;i<str.length();i++){
            a[i] = Integer.parseInt(str.substring(i,i+1));
        }

        for (int i =0;i<str.length();i++){
            int max = i;
            for (int j = i+1;j<str.length();j++){
                if (a[j]>a[max]){
                    max = j;
                }
            }
            if (a[i]<a[max]){
                int temp = a[i];
                a[i] = a[max];
                a[max] = temp;
            }
        }

        for (int i =0;i< str.length();i++){
            System.out.print(a[i]);
        }
    }
}
