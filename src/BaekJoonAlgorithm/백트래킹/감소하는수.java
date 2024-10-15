package BaekJoonAlgorithm.백트래킹;

import java.util.*;

public class 감소하는수 {
    static List<Long> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n>=1023){
            System.out.println(-1);
            return;
        }

        for (int i =0;i<=9;i++){
            backTracking(i,i);
        }
        Collections.sort(list);

        System.out.println(list.get(n));

    }

    static void backTracking(long current, int lastValue){
        list.add(current);

        for (int i =0; i<lastValue;i++){
            backTracking(current*10 +i,i);
        }
    }
}
