package Do_It_Book.chapter3;

import java.util.Scanner;

/**
 * 이진 검색
 * 중앙값을 비교하면서 값을 찾아가는 검색 방법
 * 시작값 start 끝값 last 중앙값 (start+last)/2
 */
public class BinSearch {

    static int binSearch(int [] a, int n, int key){
        int start =0;
        int last = n-1;

        do{
            int cen = (start+last)/2;
            if (a[cen]==key)
                return cen;
            else if (a[cen] < key) {
                start = cen+1;
            }
            else
                last = cen-1;
        }while (start <= last);

        return -1;
    }

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

        int search = binSearch(x, num, key);

        if (search == -1){
            System.out.println("값이 없습니다.");
        }else
            System.out.println("선택한 값은 x["+search+"]에 위치해 있습니다.");
    }
}
