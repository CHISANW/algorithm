package programmers.level_2;

import java.util.Arrays;

public class solve_70129 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));

    }

    static int[] solution(String s) {
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
