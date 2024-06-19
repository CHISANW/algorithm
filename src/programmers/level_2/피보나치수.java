package programmers.level_2;

public class 피보나치수 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));        //result -> 	2

        int n1 =5;
        System.out.println(solution(n1));       //result -> 	5

    }

    public static int solution(int n) {
        int[] fibo = new int[1000000];

        fibo[1] = 1;
        fibo[2] = 1;

        for(int i = 3; i< 1000000;i++){
            fibo[i] = (fibo[i-1] + fibo[i-2]) % 1234567;
        }

        return fibo[n];
    }
}
