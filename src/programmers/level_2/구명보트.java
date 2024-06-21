package programmers.level_2;

import java.util.*;

public class 구명보트 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        System.out.println(solution(people,limit)); // result -> 3
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int i = 0;
        int j = people.length-1;

        while(i<=j){
            if(people[i] + people[j] <= limit){
                i += 1;
            }

            j -=1;
            answer+=1;
        }
        return answer;
    }
}
