package chapter2;

/**
 * 정수가 하나이상 존재하면 그수는 합성수 이다.
 * 1000이하의 소수를 나열하는 프로그램
 */
public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;        //나눗셈 횟수

        for (int n=2; n<=1000;n++){
            int i;
            for(i=2;i<n; i++){
                counter++;
                if (n%i==0)     //나누어 떨어지면 소수가 아님
                    break;;
            }
            if (n==i)
                System.out.println(n);
        }

        System.out.println("나눗셈을 수행한 횟수: "+counter);
    }
}
