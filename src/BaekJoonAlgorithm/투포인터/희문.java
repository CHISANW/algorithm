package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

public class 희문 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int T = stdIn.nextInt();

        for (int i =0;i<T;i++){
            char[] str = stdIn.next().toCharArray();        //문자열 배열

            int l = 0;          //left
            int r= str.length-1;    //right
            int ans = 0;        //정답

            while (l<=r){       //반복
                if (str[l]!=str[r]) {
                    if (isPalieDrom(str, l + 1, r) || isPalieDrom(str, l, r - 1))
                        ans = 1;       //메소드를 통해 true가 하나라도 있다면 해당 문자열은 희문인 수
                    else ans = 2;    //그렇지 않다면 해당 문자열은 일반 문자열로 판단
                    break;

                }
                l++;
                r--;
            }
            System.out.println(ans);
        }

    }

    private static boolean isPalieDrom(char[] str, int r, int l) {
        while (r<=l){
            if (str[r]!=str[l])return false;
            r++;
            l--;
        }
        return true;
    }
}
