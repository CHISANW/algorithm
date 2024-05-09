package BaekJoonAlgorithm.재귀호출;

import java.io.InputStreamReader;
import java.io.*;

public class 재귀의_재귀 {
    static int count = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            String str = br.readLine();
            System.out.println(isPalindrome(str)+" "+count);
            count=0;
        }
    }

    static int isPalindrome(String str){
        return recursion(str,0,str.length()-1);
    }

    static int recursion(String str ,int start, int last){
        count++;
        if (start>=last) return 1;
        else if (str.charAt(start)!=str.charAt(last))return 0;
        else return recursion(str,start+1, last-1);
    }
}
