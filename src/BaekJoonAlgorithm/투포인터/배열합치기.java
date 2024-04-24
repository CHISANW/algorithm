package BaekJoonAlgorithm.투포인터;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 배열합치기 {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] a= new int[N];        //a배열
        for (int i =0;i<N;i++){     
            a[i] = stdIn.nextInt();
        }

        int[] b= new int[M];        //b배열
        for (int i=0;i<M;i++){
            b[i]= stdIn.nextInt();
        }

        int[] ansArr = new int[N+M];
        int indexA = 0; //a인덱스
        int indexB = 0; //b인덱스
        int ansIndex = 0; //정답 인덱스

        while (indexA<N && indexB<M){     //A,B 배열중 하나의 배열이 끝이 날떄까지 반복
            if (a[indexA]<b[indexB]){         //인덱스 a가 b보가 작을떄
                ansArr[ansIndex++] = a[indexA++];       //정답 배열에 a값을 삽입
            }else                                   //b가 a보다 작을때면
                ansArr[ansIndex++] = b[indexB++];            //정답 배열에 b값을 삽입
        }

        while (indexA<N) ansArr[ansIndex++] = a[indexA++];      //A배열이 남아있다면
        while (indexB<M) ansArr[ansIndex++] = b[indexB++];      //B배열이 남아있다면

        //데이터 출력값이 많기때문에 버퍼클래스사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //출력
        for (int ansInt : ansArr){
            bw.write(ansInt+" ");
        }
        bw.flush();
        bw.close();
    }
}
