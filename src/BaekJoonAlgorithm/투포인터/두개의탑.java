package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

public class 두개의탑 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        int[] distance = new int[N];
        int distanceSum = 0;
        for (int i = 0; i < N; i++) {
            distance[i] = stdIn.nextInt();
            distanceSum += distance[i];
        }


        int pairIndex = 0;       //경계선
        int disIndex = 0;       //시작
        int disCountIndex = distanceSum;   //b 값
        int ans = 0;    //정답

        for (int i = 0; i < N; i++) {
            while (disIndex < disCountIndex) {      //a값이 b값보다 작을때 실행
                disIndex += distance[pairIndex];      //의 값을증가
                disCountIndex -= distance[pairIndex];     //b의 값을 감소
                pairIndex = (pairIndex + 1) % N;        // 환형 구조여서 모듈러

            }

            ans = Math.max(ans, disCountIndex);     //최댓값을 구하는 문제여서 ans와 b의 값이 어떤게 큰지 비교후 ans 대입
            //다음 범위가 i+1로 증가히가때문에
            disIndex-=distance[i];          //a의 값을 하나 감소해서 까워짐
            disCountIndex+=distance[i];     //b의 값을 증가해서 멀어짐
        }
        System.out.println(ans);
    }
}
