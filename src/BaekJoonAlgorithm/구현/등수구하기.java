package BaekJoonAlgorithm.구현;

import java.util.*;

public class 등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int newScore = sc.nextInt();
        int p = sc.nextInt();

        List<Integer> rank = new ArrayList<>();

        for (int i= 0; i<n;i++){
            rank.add(sc.nextInt());
        }

        int rankCount = 1;

        if (n==0){
            System.out.println(1);
            return;
        }

        if (n == p && newScore<=rank.get(rank.size()-1)){
            System.out.println(-1);
            return;
        }

        for (int i =0; i<n;i++) {
            if (newScore < rank.get(i)) {
                rankCount++;
            } else {
                break;
            }
        }

        System.out.println(rankCount);
    }
}
