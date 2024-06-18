package programmers.Level_1;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(solution(n,m)));     //result => [3, 12]
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int a = n;
        int b = m;
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        answer[0] = a;
        answer[1] = (n * m)/a;
        System.out.println(a);

        return answer;
    }
}
