package Do_It_Book.chapter6.bouble;

import java.util.Scanner;

/**
 * 버블정렬 개선
 * exchg 변수 = 패스할 값 
 * 만약 0일라면 반복문을 종료해 성능 향상
 */
public class BubbleSortV2 {

    static void swap(int[] a,int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2]= t;
    }

    static void bubbleSort(int[] a, int n){
        for(int i=0;i<n-1;i++){
            int exchg = 0;
            for (int j= n -1;j>i;j--){
                if(a[j-1]>a[j]){
                    swap(a, j-1,j);
                    exchg++;
                }
                if (exchg==0) break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x= new int[nx];

        for (int i =0; i<nx;i++){
            System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x,nx);

        System.out.println("오름차순으로 정렬");
        for (int i =0;i<nx; i++)
            System.out.println("x["+i+"]="+x[i]);
    }
}
