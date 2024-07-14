package programmers.level_2;

import java.util.*;

public class 디펜스게임 {
    public static void main(String[] args) {
        int[] enemy = {4,2,4,5,3,3,1};
        System.out.println(solution(7,3,enemy));

        int[] enemy1 = {3, 3, 3, 3};
        System.out.println(solution(2,4,enemy1));
    }
    static int solution(int n, int k, int[] enemy){
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int totalEnemy = 0;

        for(int i =0 ;i<enemy.length;i++){
            totalEnemy += enemy[i];
            q.add(enemy[i]);

            if(totalEnemy > n){
                if(k > 0) {
                    totalEnemy -= q.poll();
                    k--;
                }else{
                    return i;
                }
            }
        }

        return enemy.length;
    }
}
