package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

/*
슬라이딩 윈도우로 풀이
 */
public class 소가길을건너간이유5 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();        // 횡단보도 개수
        int K = stdIn.nextInt();        // 연속된 전증
        int B = stdIn.nextInt();        // 고장난 전등

        boolean[] el = new boolean[N+1];        // 1부터 시작하기때문에 1를 추가

        while (B-- > 0) {
            int idx = stdIn.nextInt();
            el[idx] = true;
        }

        int currentCount=0;                 //1~6까지의 처음 고장난 신호등의 갯수
        for (int i =1;i<=K;i++){
            if (el[i])
                currentCount++;
        }

        int ansCount = currentCount;       // 정답ans를 currentCount로초기화해 슬라이딩 윈도우를 통해 변수를 최소값으로 초기화
        for (int i =2;i<=N-K+1;i++){            // 다음 스라이딩 칸인 2부터 6까지의 5개칸으로 옮겨준다
            if (el[i-1]) currentCount--;        // 옮겨진 슬라이딩이기때문에 이전칸의 대해서 신호등값을 판단해 currentCount 변의 값을 변경해준다.
            if (el[i+K-1]) currentCount++;      // 다음칸인 값의 대해서 true,false를 판단해 currentCount 값을 변경해준다.
            ansCount = Math.min(ansCount,currentCount);     // ans와 currentCount를 비교해 초기의 구한 스라이딩값과 다음번째로 이동한 스라이딩 값의 고장난 신호드으이 값을 가지고 최소값을 구해서 정답변수를 초기화해준다.
        }

        System.out.println(ansCount);

    }
}
