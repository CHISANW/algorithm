package programmers.백트래킹;

import java.util.*;

public class 외벽점검 {
    public static void main(String[] args) {
        int n = 12;
        int[] weak = {1,5,6,10};
        int[] dist = {1,2,3,4};
        System.out.println(solution(n,weak,dist)); //result = 2;

        int n1 = 12;
        int[] weak1 = {1, 3, 4, 9, 10};
        int[] dist1 = {3, 5, 7};
        System.out.println(solution(n1,weak1,dist1)); //result = 1;
    }

    static int answer, length;
    static int[] board;
    static boolean[] used;  // 체크한 사용자 배열
    static int solution(int n, int[] weak, int[] dist){

        answer = -1;
        length = weak.length;
        board = new int[length*2];

        for(int i = 0; i<2;i++){
            for(int j=0;j<length;j++){
                board[j + (i*length)] = weak[j] +(i*n);
            }
        }

        Arrays.sort(dist);
        used = new boolean[dist.length];

        for(int i = 1;i<= dist.length;i++){
            int[] org = new int[i]; // 복사한 배열
            System.arraycopy(dist, dist.length-i,org,0,i);
            backTrack(0,new int[i],org);
            if(answer > 0){
                break;
            }
        }

        return answer;

    }
    static void backTrack(int n, int[] dist, int[] org){
        if(n == org.length){
            if(isCheck(dist)){
                answer = n;
                return;
            }
        }

        for(int i = 0;i<org.length;i++){
            if(!used[i]){
                used[i] = true;
                dist[n] = org[i];
                backTrack(n+1,dist,org);
                used[i] = false;
            }
        }
    }

    // 현재 인원수로 취약 지점을 모두 탐색할수 있는지 확인
    static boolean isCheck(int[] dist){
        for(int i = 0; i<length;i++){
            int idx = i;
            for(int distance : dist){
                int pos = board[idx++] + distance;
                while (idx <= board.length && board[idx] <= pos)
                    idx++;
            }

            if(idx-i >= length){
                return true;
            }
        }

        return false;
    }
}
