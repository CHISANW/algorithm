package BaekJoonAlgorithm.그리디;

import java.util.*;

public class 볼모으기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String balls = sc.next();

        int rCount = 0;
        int bCount = 0;

        for (int i =0; i<n;i++){
            char c = balls.charAt(i);
            if (c == 'R') rCount++;
            else bCount++;
        }

        int cnt = 0;
        int result = Integer.MAX_VALUE;

        for (int i =0; i<n;i++){
            if (balls.charAt(i) == 'R'){
                cnt++;
            }else break;
        }

        result = Math.min(result,rCount - cnt);

        cnt = 0;

        for (int i =n-1; i>=0;i--){
            if (balls.charAt(i) == 'R'){
                cnt++;
            }else break;
        }
        result = Math.min(result,rCount - cnt);


        cnt = 0;
        for (int i =0; i<n;i++){
            if (balls.charAt(i) == 'B'){
                cnt++;
            }else break;
        }

        result = Math.min(result,bCount - cnt);

        cnt = 0;

        for (int i =n-1; i>=0;i--){
            if (balls.charAt(i) == 'B'){
                cnt++;
            }else break;
        }
        result = Math.min(result,bCount - cnt);

        System.out.println(result);

    }

}
