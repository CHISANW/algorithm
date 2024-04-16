package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 분해합 {

    static int genateSeec(int seed){
        int ans = seed;

        while (seed >0){
            ans += seed%10;
            seed/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        int ans = 0;
        for (int i =0;i<=n;i++){
            if (genateSeec(i)==n){
                ans=i;
                break;
            }
        }

        System.out.println(ans);
    }
}
