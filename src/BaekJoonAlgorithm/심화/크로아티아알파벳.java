package BaekJoonAlgorithm.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 크로아티아 알파벳
 */
public class 크로아티아알파벳 {
    public static void main(String[] args) throws IOException {
        String[] alpa = new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for(int i = 0;i<alpa.length;i++){
            if (s.contains(alpa[i])){
                s=s.replace(alpa[i],"0");
            }
        }
        System.out.println(s.length());
        br.close();
    }
}
