package BaekJoonAlgorithm.랜덤_마라톤.Solve_63;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem_30684 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String name = sc.next();
            if(name.length() == 3){
                arr.add(name);
            }
        }

        Collections.sort(arr);
        System.out.print(arr.get(0));


    }
}
