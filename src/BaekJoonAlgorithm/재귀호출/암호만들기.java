package BaekJoonAlgorithm.재귀호출;

import java.util.*;

public class 암호만들기 {
    static int l, c;
    static char[] input;
    static char[] password;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        l = sc.nextInt();       // 서로다른 알파벳[비밀번호]
        c = sc.nextInt();       // 문자 종류 개수

        input = new char[c];
        password = new char[l];
        for (int i =0;i<c;i++){
            input[i] = sc.next().charAt(0);
        }

        Arrays.sort(input); //오름차순 정렬
        generate(0,0,0);
    }

    static void generate(int length,int index,int vowelCnt){

        if (length==l){
            if (vowelCnt>=1 && l-vowelCnt >=2)       //모음의 개수는 1보다 크고 자음의 개수는 2보다 클때
                System.out.println(password);
            return;
        }

        if (index<c){
            password[length] = input[index];
            int v = isVowel(input[index]) ? 1 : 0;
            generate(length+1, index+1, vowelCnt+v);

            password[length]=0;
            generate(length,index+1,vowelCnt);
        }
    }

    static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
