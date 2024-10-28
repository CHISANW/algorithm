package BaekJoonAlgorithm.그리디;

import java.util.Scanner;

public class 팔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.next();
        String r = sc.next();


        if (l.length() != r.length()){
            System.out.println(0);
        }else{
            int count = 0;
            for (int i = 0; i<l.length();i++){
                if (l.charAt(i) != r.charAt(i)){
                    break;
                }else{
                    if (l.charAt(i)=='8'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
