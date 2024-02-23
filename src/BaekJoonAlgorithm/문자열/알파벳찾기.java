package BaekJoonAlgorithm.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 10809번 너무 복잡한 수정
 */
public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Character[] a = new Character[26];
        int [] d= new int[26];
        char b =(char)97;

        for (int i=0;i<a.length;i++){
            a[i] = (char) (b+i);
        }

        for (int i =0;i<d.length;i++) {
            d[i] = -1;
        }
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (a[j].equals(s.charAt(i))) {
                    if (d[j] == -1) { // Only update if it's the first occurrence
                        d[j] = i;
                    }
                }
            }
        }
        for (int i =0;i<d.length;i++){
            sb.append(d[i]).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
