package programmers.level_2;

import java.util.*;

public class H_index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations)); //result -> 3
    }

    public static int solution(int[] citations) {
        List<Integer> list = new LinkedList<>();

        int answer = 0;
        for(int i : citations){
            list.add(i);
        }

        list.sort(Collections.reverseOrder());

        for(int i =0 ;i<list.size();i++){        // i는 현재 논문 갯수(i+1)
            int value = list.get(i);     // 인용수
            int size = list.size();      // 총 논문수
            int mod = size - (i+1);      // 나머지 논문

            if(value >= i+1 && value>= mod ){
                answer = i+1;
            }
        }
        return answer;
    }
}
