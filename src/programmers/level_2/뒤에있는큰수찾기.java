package programmers.level_2;

import java.util.Arrays;

public class 뒤에있는큰수찾기 {
    public static void main(String[] args) {
        int[] numbers ={2, 3, 3, 5};
        System.out.println(Arrays.toString(solution(numbers)));      //result -> [3, 5, 5, -1]

        int[] numbers1 ={9, 1, 5, 3, 6, 2};
        System.out.println(Arrays.toString(solution(numbers1)));      //result -> [-1, 5, 6, 6, -1, -1]
    }
    public static int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];


        int[] arr = new int[n];
        int index= -1;

        for(int i = n-1; i>=0; i--){

            while(index>=0 && arr[index]<= numbers[i]){
                index--;
            }

            answer[i] = index < 0 ? -1 : arr[index];
            arr[++index] = numbers[i];
        }
        return answer;
    }

}
