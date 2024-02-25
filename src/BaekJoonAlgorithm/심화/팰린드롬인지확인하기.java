package BaekJoonAlgorithm.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 10988번
 */
public class 팰린드롬인지확인하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String read = br.readLine();

        StringBuffer bf = new StringBuffer(read);
        bf.reverse();
        String value = String.valueOf(bf);

        if(value.equals(read))
             System.out.println(1);
        else
             System.out.println(0);
        br.close();
    }
}
