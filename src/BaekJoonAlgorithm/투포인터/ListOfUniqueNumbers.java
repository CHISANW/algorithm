package BaekJoonAlgorithm.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ListOfUniqueNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       // 입력수가 많아서 버터 사용
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i =0;i<N;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }

        boolean[] appeared = new boolean[100001];

        //투포인터 알고리즘
        long ansCount = 0;  //정답
        int nextIndex = 0;  //투포인터 
        for (int i =0;i<N;i++){
            while (nextIndex<N){        //투포인터가 N전까지만 가도록 순회
                if (appeared[arr[nextIndex]]) break;        //만약 appeared 배열에  arr[투포인터] 에대한 값이 존재한다면 연속된 값이기때문에 while문 종료
                appeared[arr[nextIndex++]]= true;           // 위에 if문이 통과 되었다면, 연속되지 않은 값이기떄문에 appeared 배열의 해당 값을 true 변경
            }
            ansCount += nextIndex-i;                        // while 을 다돌았으때 투포인터의 인덱스 범위에서 현재 i의 범위 빼면 총 길이가 나온다.
            appeared[arr[i]]=false;                         // for문의 i+1의 값을 검사해야하기때문에 현재 i의 값은 appeared배열의 값을 초기화 시켜줘야한다.
        }
        System.out.println(ansCount);                       // 정답 출력
    }
}
