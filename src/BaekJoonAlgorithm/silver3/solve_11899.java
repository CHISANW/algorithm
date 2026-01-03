package BaekJoonAlgorithm.silver3;

import java.util.Scanner;

public class solve_11899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        boolean combination = false;

        while (!combination){
            String replace = line.replace("()", "");
            if(replace.equals(line)){
                combination = true;
            }else{
                line = replace;
            }
        }

        System.out.println(line.length());
    }
}
