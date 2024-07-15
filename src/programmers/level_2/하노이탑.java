package programmers.level_2;

import java.util.*;

public class 하노이탑 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(2)));       // result -> [[1,2], [1,3], [2,3]]
    }

    static List<int[]> list = new ArrayList<>();
    static int[][] solution(int n){

        move(n,1,2,3);
        int[][] answer = list.stream().toArray(int[][]::new);

        return answer;
    }

    static void move(int n, int start, int mid, int end){
        if(n == 0){
            return;
        }
        move(n-1, start, end, mid);
        list.add(new int[]{start,end});
        move(n-1, mid, start, end);
    }
}
