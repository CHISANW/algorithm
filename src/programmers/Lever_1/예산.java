package programmers.Lever_1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d,budget));     //result -> 3
    }
    public static int solution(int[] d, int budget) {
        int  n = d.length;

        Arrays.sort(d);
        int sum = 0;
        int count = 0;
        for(int i = 0; i<n;i++){

            if(sum + d[i] <=budget){
                sum += d[i];
                count++;
            }
        }

        return count;
    }
}
