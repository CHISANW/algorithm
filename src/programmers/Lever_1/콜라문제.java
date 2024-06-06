package programmers.Lever_1;

public class 콜라문제 {
    public static void main(String[] args) {
        int a= 2, b=1 , n= 20;
        System.out.println(solution(a,b,n));//result -> 19

        int a1= 3, b1=1 , n1= 19;
        System.out.println(solution(a1,b1,n1));//result -> 9

    }
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int newBottles = (n / a) * b;
            answer += newBottles;
            n = (n % a) + newBottles;
        }

        return answer;
    }
}
