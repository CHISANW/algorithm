package BaekJoonAlgorithm.구간합;

import java.io.*;
import java.util.*;

public class 인간컴퓨터상호작용 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[][] prefix = new int[26][s.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            for (int j = 0; j < 26; j++) {
                prefix[j][i + 1] = prefix[j][i];
            }
            prefix[charIndex][i + 1]++;
        }

        for (int i =0; i<prefix.length;i++){
            for (int j =0;j<s.length()+1;j++){
                System.out.print(prefix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int charIndex = a - 'a';
            int count = prefix[charIndex][r + 1] - prefix[charIndex][l];

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}
