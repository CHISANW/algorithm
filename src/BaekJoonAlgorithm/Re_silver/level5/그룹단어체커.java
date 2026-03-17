package BaekJoonAlgorithm.Re_silver.level5;

import java.io.*;

public class 그룹단어체커 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i =0; i<n;i++){
            String now = br.readLine();
            if(groupChecker(now)) count++;
        }
        System.out.println(count);


    }

    static boolean groupChecker(String value){
        boolean[] check = new boolean[26];

        char before = value.charAt(0);
        check[value.charAt(0) - 'a'] = true;
        for(int i =1; i<value.length();i++){

            if(before != value.charAt(i) && check[value.charAt(i) - 'a']){
                return false;
            }
            check[value.charAt(i) - 'a'] = true;
            before = value.charAt(i);
        }

        return true;
    }
}
