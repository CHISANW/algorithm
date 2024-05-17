package programmers.스택_큐_덱;

import java.util.*;

public class 주식가격 {
    public static void main(String[] args) {

        int[] prices = {1,2,3,2,3};
        System.out.println(Arrays.toString(solution(prices)));       //result -> [4, 3, 1, 1, 0]
    }

    static int[] solution(int[] prices){
        int len = prices.length;
        Deque<Integer> stack = new ArrayDeque<>();

        int[] answer = new int[len];       // 정답 배열 생성

        stack.push(0);      //인덱스 값을 통해 비교

        for(int i =1;i<len;i++){
            while(!stack.isEmpty() && prices[stack.peek()]>prices[i]){
                int j = stack.pop();        // 인덱스 번호로 조회
                answer[j] = i - j;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int j = stack.pop();
            answer[j] = len - 1 - j;
        }
        return answer;
    }
}
