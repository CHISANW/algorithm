package Do_It_Book.chapter6.ShellSort;

import java.util.Scanner;

/**
 * 쉘정렬 8개의 값 이있다면 먼저 4칸 떨어저있는 수부터 비교해가며 교환한다. 그후에는 2칸 떨어저있는 수부터 교환해가며 나머지 마지막에는 단순 삽입정렬을 통해서 해결하는 알고리즘
 */
public class ShellSort {

    static void shellSort(int[] a, int n){
        for (int h =n/2; h>0; h /=2)
            for (int i = h; i<n; i++){
                int j;
                int tmp = a[i];
                for (j =i-h; j>=00&&a[j]>tmp; j -= h)
                    a[j+h] = a[j];
                a[j+h] = tmp;
            }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("쉘 정렬(버전1)");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x= new int[nx];

        for (int i =0; i<nx;i++){
            System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        shellSort(x,nx);

        System.out.println("오름차순으로 정렬");
        for (int i =0;i<nx; i++)
            System.out.println("x["+i+"]="+x[i]);
    }

}
