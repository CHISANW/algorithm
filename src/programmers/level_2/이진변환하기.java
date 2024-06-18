package programmers.level_2;

import java.util.Arrays;

public class 이진변환하기 {
    public static void main(String[] args) {
        String s ="110010101001";
        System.out.println(Arrays.toString(solution(s))); //result -> [3,8]

        String s1 = "01110";
        System.out.println(Arrays.toString(solution(s1)));    //result -> [3,3]
    }

    public static int[] solution(String s) {
        int zerocount= 0;
        int count = 0;
        String bianry = s;

        while(!bianry.equals("1")){
            int zero = 0;
            for( char c : bianry.toCharArray()){
                if(c == '0') zero++;
            }
            String replace = bianry.replace("0","");
            int before = bianry.length();
            int minus = before - zero;
            count++;
            zerocount += zero;

            bianry = Integer.toString(minus,2);
        }
        return new int[]{count,zerocount};
    }
}
