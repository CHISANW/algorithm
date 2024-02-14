package Do_It_Book.chapter6.simpleSort;

import java.util.Scanner;

/**
 * 단순 삽입정렬
 * 맨 요소 첫번째 값과 정렬되지 않은 요소중 제일 작은 값을 서로 비교하여 교환하는 알고리즘
 * 비교 횟수눈 (n2제곱 -n)/2번
 * 시간 복작도는 O(n제곱) 이므로 성능이 좋지는 않다.
 */
public class SelectionSort {

    static void swap(int[] a,int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2]= t;
    }

    static void selectionSort(int[] a, int n){
       for (int i =0; i<n-1;i++){
           int min = i; //아직 정렬되지않은 인덱스
           for(int j= i+1;j<n;j++)
               if (a[j]<a[min])
                   min=j;
           swap(a,i,min);
       }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순 삽입정렬");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x= new int[nx];

        for (int i =0; i<nx;i++){
            System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        selectionSort(x,nx);

        System.out.println("오름차순으로 정렬");
        for (int i =0;i<nx; i++)
            System.out.println("x["+i+"]="+x[i]);
    }
}
