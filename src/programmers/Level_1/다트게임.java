package programmers.Level_1;

public class 다트게임 {
    public static void main(String[] args) {

        String s = "1S2D*3T";
        System.out.println(solution(s)); // result -> 37
    }

    public static int solution(String dartResult) {
        int ans = 0;
        String[] darts = dartResult.split("");
        int[] score = new int[3];

        int index = -1;
        for(int i = 0; i<darts.length;i++){
            int first_dart = darts[i].charAt(0)-'0';

            if(first_dart>=0 && first_dart<10){
                index++;
                score[index] = first_dart;

                int next_dart = darts[i+1].charAt(0)-'0';

                //두자리수의 다트 인가?
                if(next_dart>=0 && next_dart<10){
                    score[index] *=10;
                    i++;
                }
            }

            switch (darts[i]){
                case "D" -> score[index] = (int) Math.pow(score[index],2);
                case "T" -> score[index] = (int) Math.pow(score[index], 3);
                case "*" ->{
                    score[index] *= 2;
                    if(index-1 >= 0) score[index-1] *=2;
                }
                case "#" -> score[index] *= -1;
            }
        }
        for (int i : score) {
            ans+=i;
        }
        return ans;
    }
}
