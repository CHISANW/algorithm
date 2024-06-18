package programmers.Level_1;

import java.util.Arrays;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {

        String s = "banana";
        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i=0;i<s.length();i++){
            if(i !=0){
                int idx = s.substring(0,i).lastIndexOf(s.charAt(i));
                if(idx != -1){
                    answer[i] = i-idx;

                }
                else{
                    answer[i] = idx;
                }
            }
            else{
                answer[i] = -1;
            }
        }

        return answer;
    }
}
