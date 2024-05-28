package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 수이어쓰기1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = 1;       //자릿수
        int ans = 0;        // 정답
        int length =10;     //현재자릿수의 총 개수

        for(int i = 1;i<=n;i++){
            if(i==length){      //현재 반복이 자릿수랑 같다면
                temp++;         // 자리숫의 값을 +1하고
                length*=10;     // 자리수의 총값을 10을 곱해
            }
            ans+= temp;
        }

        System.out.println(ans);
    }
}
