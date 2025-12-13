package BaekJoonAlgorithm.silver4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solve_11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        List<String> list= new ArrayList<>();

        for(int i =0; i<str.length();i++){
            list.add(str.substring(i));
        }


        list.sort((a,b) -> a.compareTo(b));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
