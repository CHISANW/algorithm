package Do_It_Book.chapter5.recursion;

import java.util.Scanner;

/**
 * 메모리를 활용한 재귀호출
 */
public class RecurMemo {

    static String memo[];

    static void recur(int n){
        if (memo[n+1] !=null)
            System.out.print(memo[n+1]);        //메모출력
        else {
            if (n>0){
                recur(n-1);
                System.out.println(n);
                recur(n-2);
                memo[n+1] = memo[n]+n+"\n"+memo[n-1];   //메모화
            }else {
                memo[n+1] = "";     //메모화: recur(0)과 recur(-1)은 빈문자열
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = stdIn.nextInt();

        memo=new String[num+2];
        recur(num);
    }
}
