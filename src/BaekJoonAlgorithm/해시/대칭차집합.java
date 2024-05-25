package BaekJoonAlgorithm.해시;

import java.util.*;

public class 대칭차집합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for(int i =0;i<a;i++){
            A.add(sc.nextInt());
        }
        for(int i =0;i<b;i++){
            B.add(sc.nextInt());
        }

        for(int i :B){
            if(A.contains(i)){
                count++;
            }
        }
        count = A.size()-count;

        for(int i :A){
            if(B.contains(i)){
               B.remove(i);
            }
        }

        System.out.println(count+B.size());
    }
}
