package BaekJoonAlgorithm.분할정복;

import java.util.*;

public class 곱셉 {
    static int a, b, c;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(power(a,b));

    }
    static long power(long a, long b){
        //정복 조건
        if(b == 1) return a % c;        // 재귀를 하면서 마지막이 1이었을 때 결국 홀수일때

        //분활 재귀 실행
        long half = power(a,b/2);        // 수학 공식으로 (n^5 = n^2 * n^2 * n^1) 과동일 재귀로 도출
        if(b % 2==0){        //제곱부분이 짝수일때는 a % c 안해도됨
            return (half * half) % c; // 나머지 진행
        }else{            // 홀수 일때는 n^1을 해야함
            // Overflow를 대비해 분배 법칙으로 계산
            return (((half * half) % c) * a) % c;
        }
    }
}
