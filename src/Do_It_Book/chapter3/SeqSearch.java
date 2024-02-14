package Do_It_Book.chapter3;

import java.util.Scanner;

public class SeqSearch {

    //while문으로 만든 검색
    static int seqSearch_while(int[] a, int n, int key){
        int i = 0;

        while (true){
            if(i == n)
                return -1;
            if(a[i] == key)
                return i;
            i++;
        }
    }

    static int seqSearch_for(int[] a, int n, int key){
        for (int i=0; i<n; i++){
            if (a[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i =0;i<num;i++){
            System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

//        int search = seqSearch_while(x, num, key);
        int search = seqSearch_for(x, num, key);

        if (search == -1)
            System.out.printf("선택한 값이 없습니다.");
        else
            System.out.printf("선택한 값은 x["+search+"] 에있습니다.");
    }
}
