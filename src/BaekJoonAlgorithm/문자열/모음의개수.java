package BaekJoonAlgorithm.문자열;

import java.io.*;
import java.util.*;

public class 모음의개수 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int count = 0;
            char[] str = br.readLine().toLowerCase().toCharArray();

            if (str[0]=='#') break;
            for (char c : str) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
