package programmers.Re_Level_2;

import java.util.Arrays;

public class 구멍보트 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{70, 50, 80, 50},100));
        System.out.println(solution(new int[]{70, 80, 50},100));
    }

    static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length-1;
        int answer = 0;

        while (left <= right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            answer++;
        }
        return answer;
    }
}
