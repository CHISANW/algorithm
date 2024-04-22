package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Scanner;

public class 기타레슨 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] video = new int[N+1];

        for(int i = 0;i<N;i++){
            video[i] = stdIn.nextInt();
        }


        int l=1,r=N*10000, ans = -1;
        while (l<=r){
            int m = (l+r)/2;

            if (imPosible(video,m,M)){
                r= m-1;
                ans=m;
            }else
                l = m+1;
        }

        System.out.println(ans);
    }

    private static boolean imPosible(int[] video, int videoLength, int maxLength) {
        int currentLength = 0;
        int count =1;

        for (int nowVideo : video) {
            if (nowVideo>videoLength) return false;
            if (currentLength+nowVideo>videoLength){
                if (++count>maxLength) return false;
                currentLength = 0;
            }
            currentLength+=nowVideo;
        }
        return true;
    }
}
