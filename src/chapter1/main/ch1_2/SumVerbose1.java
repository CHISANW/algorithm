package chapter1.main.ch1_2;

import java.util.Scanner;


/*이런식으로 작성하는 거는 성능에 효율 성이 떨어진다. 그러므로 SumVerbose2 버전으로 작성하는 것이 옳다*/
public class SumVerbose1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do{
            System.out.print("n값 :");
            n=stdIn.nextInt();
        }while (n<=0);

        int sum = 0;

        for(int i=1;i<=n;i++){
            if(i<n) System.out.print(i+"+");
            else System.out.print(i+"=");
            sum +=i;
        }

        System.out.println(sum);
    }
}
