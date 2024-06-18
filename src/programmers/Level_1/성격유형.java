package programmers.Level_1;

import java.util.Arrays;

public class 성격유형 {
    public static void main(String[] args) {

        String[] survey ={"AN", "CF", "MJ", "RT","NA"};
        int[] choices ={5, 3, 2, 7, 5};
        System.out.println(solution(survey,choices));


        String[] survey1 ={"TR", "RT", "TR"};
        int[] choices1 ={7, 1, 3};
        System.out.println(solution(survey1,choices1));
    }

    static int[][] arr = new int[4][2];
    public static String solution(String[] survey, int[] choices) {
        String answer = "";

        int[] choice = {0,3,2,1,0,1,2,3};

        for(int i =0;i<survey.length;i++){
            String[] str = survey[i].split("");
            int value = choices[i];
            if(value >= 1 && value <= 3){
                setcount(str[0],choice[choices[i]]);
            }else if(value >= 4 && value <= 7){
                setcount(str[1],choice[choices[i]]);
            }
        }
        System.out.println(Arrays.deepToString(arr));

        String dominantChars = getDominantChars();
        System.out.println(dominantChars);
        return answer;
    }

    static String getDominantChars() {
        StringBuilder result = new StringBuilder();
        char[][] cmd = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        for (int i = 0; i < arr.length; i++) {      //4까지
            int maxIndex = 1;
            if(arr[i][0]> arr[i][1]){
                maxIndex = 0;
            }if(arr[i][0] == arr[i][1]){
                if(cmd[i][0] < cmd[i][1]){
                    maxIndex= 0;
                }
            }
            result.append(cmd[i][maxIndex]);
        }

        return result.toString();
    }

    static void setcount(String str,int count){
        switch(str){
            case "R"-> arr[0][0] += count;
            case "T"-> arr[0][1] += count;
            case "C"-> arr[1][0] += count;
            case "F"-> arr[1][1] += count;
            case "J"-> arr[2][0] += count;
            case "M"-> arr[2][1] += count;
            case "A"-> arr[3][0] += count;
            case "N"-> arr[3][1] += count;
        }
    }
}