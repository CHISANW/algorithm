package programmers.level_2;

import java.util.*;

public class 줄서는방법 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,5)));
    }

    static int[] solution(int n , long k){

        List<Integer> list = new ArrayList<>();
        int[] answer = new int[n];
        int fact = 1;

        for(int i = 1;i<=n;i++){
            list.add(i);
            fact *= i;
        }

        k--;

        for(int i = 0;i<n;i++){
            fact /= (n-i);
            int index = (int) (k/ fact);
            answer[i] = list.remove(index);
            k %= fact;
        }
        return answer;
    }
}
