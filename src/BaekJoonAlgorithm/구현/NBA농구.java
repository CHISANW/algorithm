package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class NBA농구 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int score1= 0;
        int score2 = 0;

        int lastLeadTeamTime = 0;

        int leadTime1 = 0;
        int leadTime2 = 0;

        int lastTime = 60*48;

        for (int i =0; i<n;i++){
            int team = sc.nextInt();

            String[] parts = sc.next().split(":");
            int scoreTime = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);

            if (score1> score2){
                leadTime1 += scoreTime - lastLeadTeamTime;
            }else if (score2 > score1)
                leadTime2 += scoreTime - lastLeadTeamTime;

            if (team==1){
                score1++;
            }else
                score2++;

            lastLeadTeamTime = scoreTime;
        }

        if (score1>score2){
            leadTime1 += lastTime - lastLeadTeamTime;
        }else if (score2> score1){
            leadTime2 += lastTime - lastLeadTeamTime;
        }

        int min1 = leadTime1 / 60;
        int sec1 = leadTime1 % 60;
        int min2 = leadTime2 / 60;
        int sec2 = leadTime2 % 60;

        System.out.println(String.format("%02d:%02d",min1,sec1));
        System.out.println(String.format("%02d:%02d",min2,sec2));

    }
}
