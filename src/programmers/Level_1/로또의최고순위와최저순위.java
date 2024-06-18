package programmers.Level_1;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(lottos1,win_nums1))); // result -> [3, 5]

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        System.out.println(Arrays.toString(solution(lottos2,win_nums2))); // result -> [1, 6]

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};
        System.out.println(Arrays.toString(solution(lottos3,win_nums3))); // result -> [1, 1]
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];


        int zeroCount = 0;
        int matchCount = 0;
        for(int i = 0; i<6;i++){
            if(lottos[i] == 0){
                zeroCount++;
            }
            for(int j = 0;j<6;j++){
                if(lottos[i] == win_nums[j]){
                    matchCount++;
                }
            }
        }

        int maxRank = getRank(matchCount + zeroCount);
        int minRank = getRank(matchCount);

        answer[0] = maxRank;
        answer[1] = minRank;

        return answer;
    }

    static int getRank(int match){
        int value = 0;

        switch(match){
            case 6 -> value =1;
            case 5 -> value =2;
            case 4 -> value =3;
            case 3 -> value =4;
            case 2 -> value =5;
            case 1 -> value =6;
            case 0 -> value = 6;
        }
        return value;
    }
}
