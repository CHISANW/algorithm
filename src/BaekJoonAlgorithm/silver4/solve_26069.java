package BaekJoonAlgorithm.silver4;

import java.util.*;

public class solve_26069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> dancing = new HashSet<>();
        dancing.add("ChongChong");

        for(int i =0; i<n;i++){
            String a = sc.next();
            String b = sc.next();

            if(dancing.contains(a) || dancing.contains(b)){
                dancing.add(a);
                dancing.add(b);
            }
        }
        System.out.println(dancing.size());
    }
}
