package BaekJoonAlgorithm.silver5;

import java.util.*;

public class solve_15904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String target = "UCPC";
        int idx = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==target.charAt(idx)){
                idx++;
                if(idx == 4){
                    break;
                }
            }
        }

        if (idx == 4) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }

}
