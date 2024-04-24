package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

public class 준표의조약돌 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt(); //총개수
        int B = stdIn.nextInt();    // 검은색 개수
        int W = stdIn.nextInt();    // 화이트  개수

        char[] color = stdIn.next().toCharArray();

        int countBlack = 0;         // 검은돌 카운트
        int countWhite=0;           // 하얀돌 카운트
        int nextIndex = 0;          // 다음 인덱스
        int ans = 0;                // 정답 배열

        for (int i= 0;i<N;i++){         //반복문
            while (nextIndex<N){        // 다임인덱스가 N 까지 반복
                if (color[nextIndex]=='B' && countBlack==B) break;      //color인덱스가 블랙이거나 현재 검은돌 개수가 B의 개수랑 같다면 오답이므로 종료
                if (color[nextIndex++]=='W') countWhite++;              //만약 다음 인덱스의 값이 화이트이면 countWhite 인덱스를 증가
                else countBlack++;                                      // 하얀돌도 아니고 blackCount<B 상태라면 아직 검은돌이 나올수 있기때문에 countblack를 증가
            }
            
            if (countWhite>=W)                      // while문을 다돌고 countWhite가 화이트개수보다 클때만 검증
                ans = Math.max(ans,nextIndex-i);     // 정답 최댓값을 구하는 문제이므로 다음 인덱스에서 i값을 빼주면 최대거리가나옴 


            //다음에 i값이 증가하기 때문에 현재 값을 미리 제거해줘야함
            if (color[i]=='W') countWhite--;            //현재 배열의 값이 하얀돌이면 하얀색돌을 제거
            else countBlack--;                          // 현재 배열의 돌이 검은돌이면 검은돌을 제거해야 다음번에 바로 사용가능
        }

        System.out.println(ans);

    }
}
