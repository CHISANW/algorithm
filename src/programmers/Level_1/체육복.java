package programmers.Level_1;

import java.util.*;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(n,lost,reserve));       //result -> 5

        int n1 = 5;
        int[] lost1 = {2,4};
        int[] reserve1 = {3};
        System.out.println(solution(n1,lost1,reserve1));       //result -> 4

    }

    public static int solution(int n, int[] lost, int[] reserve){

        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌을 가져온 학생이 도난당했을때
        for(int i = 0; i<lost.length;i++){
            for(int j = 0; j<reserve.length;j++){
                if(lost[i] == reserve[j]){
                    answer++; //자기자신을 하나 +
                    lost[i] = reserve[j] = -1;
                    break;
                }
            }
        }

        for(int lostPerson : lost){
            for(int i = 0; i<reserve.length;i++){
                if(lostPerson-1 == reserve[i] || lostPerson+1 == reserve[i]){
                    answer++;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
