package Do_It_Book.chapter6.simpleSort;

import java.util.Scanner;

/**
 * 단순 삽입정렬 두번쨰 인덱스부터 시작하며 선택한 인덱스 앞인덱스를 하나하나 비교해가며 비교할 인덱스보다 작은 인덱스까지 비교한다. 작다면 작은 인덱스 뒤로 이동한다.
 * 시간 복작도는 O(n제곱) 이므로 성능이 좋지는 않다.
 */
public class InsertionSort {

    static void insertionSort(int[] a, int n){
        for(int i=1; i<n;i++){
            int j;
            int tmp = a[i];
            for (j=i; j>0 && a[j-1]>tmp; j--)
                a[j] = a[j-1];
            a[j] =tmp;
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

        insertionSort(x,nx);

        System.out.println("오름차순으로 정렬");
        for (int i =0;i<nx; i++)
            System.out.println("x["+i+"]="+x[i]);
    }
}
