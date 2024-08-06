package BaekJoonAlgorithm.구현;

import java.util.*;

public class 팬린드롬만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int[] alpha = new int[26];

        for(int i = 0; i < line.length(); i++){
            alpha[line.charAt(i) - 'A']++;
        }

        int add = 0;
        int addIndex = -1;

        for(int i = 0; i < 26; i++){
            if (alpha[i] % 2 == 1){
                add++;
                addIndex = i;
            }
        }

        if (add > 1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++){
            for(int j = 0; j < alpha[i] / 2; j++){
                sb.append((char)(i + 'A'));
            }
        }

        StringBuilder ans = new StringBuilder(sb);
        if (addIndex != -1) {
            ans.append((char) (addIndex + 'A'));
        }

        ans.append(new StringBuilder(sb).reverse());
        System.out.println(ans);
    }
}
