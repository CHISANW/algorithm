package BaekJoonAlgorithm.그리디;

import java.util.Scanner;

public class 잃어버린괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int answer = Integer.MAX_VALUE;

        String[] minus = str.split("-");

        for(int i = 0; i<minus.length;i++){
            int count = 0;
            String[] plus = minus[i].split("\\+");

            for(int j =0; j<plus.length;j++){
                count += Integer.parseInt(plus[j]);
            }

            if(answer == Integer.MAX_VALUE){
                answer = count;
            }else{
                answer -= count;
            }
        }

        System.out.println(answer);
    }
}
