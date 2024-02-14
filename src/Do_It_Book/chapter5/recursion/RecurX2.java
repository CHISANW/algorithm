package Do_It_Book.chapter5.recursion;

import Do_It_Book.chapter4.stack.IntStack;

import java.util.Scanner;

/**
 * 스택을 이용한 재귀호출 방법
 */
public class RecurX2 {
    static void recur(int n){
        IntStack s = new IntStack(n);

      while (true) {
          if (n>0){
              s.push(n);
              n=n-1;
              continue;
          }
          if (s.isEmpty()!=true){
              n=s.pop();
              System.out.println(n);
              n=n-2;
              continue;
          }
          break;
      }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요:");
        int x = stdIn.nextInt();
        recur(x);
    }
}
