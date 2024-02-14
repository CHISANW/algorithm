package Do_It_Book.chapter3;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x =  new int[num];

        System.out.println("ASC 입력");

        System.out.print("x[0]: ");
        x[0] = stdIn.nextInt();

        for (int i=1;i<num;i++){
            do{
                System.out.print("x["+i+"]: ");
                x[i] = stdIn.nextInt();
            }while (x[i]< x[i-1]);
        }

        System.out.print("검색할 값");
        int key = stdIn.nextInt();

        int search = Arrays.binarySearch(x,key);

        if (search == -1){
            System.out.println("값이 없습니다.");
        }else
            System.out.println("선택한 값은 x["+search+"]에 위치해 있습니다.");
    }
}
