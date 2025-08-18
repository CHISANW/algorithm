package BaekJoonAlgorithm.랜덤_마라톤.Solve_63;

import java.util.Scanner;

public class Problem_15920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int wCount = 0;
        boolean leverP = false;
        Boolean parityAtAtoB = null;
        boolean multi = false;

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'P'){
                leverP = !leverP;
                if(wCount >= 1 && wCount <=2) multi =true;
            }else if(ch == 'W'){
                wCount++;
                if(wCount == 1){
                    parityAtAtoB = leverP;
                }else if(wCount == 2){
                    break;
                }

            }
        }

        if(wCount<2){
            System.out.println(0);
            return;
        }
        if(multi){
            System.out.println(6);
        }else System.out.println(parityAtAtoB ? 1 : 5);

    }
}
