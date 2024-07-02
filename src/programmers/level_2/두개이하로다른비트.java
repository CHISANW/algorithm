package programmers.level_2;

import java.util.Arrays;

public class 두개이하로다른비트 {
    public static void main(String[] args) {
        long[] numbers = {2,7};
        System.out.println(Arrays.toString(solution(numbers))); //result -> [3,11]
    }

    static long[] solution(long[] numbers){
        long[] answer = new long[numbers.length];

        for(int i =0 ;i<numbers.length;i++){
            long x = numbers[i];

            if(x % 2==0){
                answer[i] = x+1;
            }else{
                long temp = x;
                int index = 0;
                while((temp&1) != 0){
                    temp>>=1;
                    index++;
                }
                answer[i] = x + (1L<<index) - (1L <<(index-1));
            }
        }

        return answer;
    }
}
