package BaekJoonAlgorithm.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 12891번
 */
public class DNA비밀번호 {
    static int checkArr[];
    static int myArr[];
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());       //숫자
        int m = Integer.parseInt(st.nextToken());       //문자열의 크기

        int result=0;
        checkArr=  new int[4];
        myArr = new int[4];
        char A[] = new char[n];
        count=0;

        A= br.readLine().toCharArray();

        st= new StringTokenizer(br.readLine());
        for (int i =0;i<4;i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i]==0){
                count++;
            }
        }

        for (int i =0;i<m;i++){
            add(A[i]);
        }

        if (count==4) result++;

        //슬라이딩 윈도우
        for (int i = m;i<n;i++){
            int j=i-m;
            add(A[i]);
            remove(A[j]);
            if (count==4) result++;
        }

        System.out.println(result);
    }

    private static void remove(char c) {
        switch (c){
            case 'A':
                if (myArr[0]==checkArr[0])
                    count--;
                    myArr[0]--;
                break;
            case 'C':
                if (myArr[1]==checkArr[1])
                    count--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2]==checkArr[2])
                    count--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3]==checkArr[3])
                    count--;
                myArr[3]--;
                break;
        }
    }

    private static void add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if (myArr[0]==checkArr[0])
                    count++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1]==checkArr[1])
                    count++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2]==checkArr[2])
                    count++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3]==checkArr[3])
                    count++;
                break;
        }

    }
}
