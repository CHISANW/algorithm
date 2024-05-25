package BaekJoonAlgorithm.그리디;

import java.util.*;

public class 보물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];

        for(int i =0;i<n;i++){
            A[i] = sc.nextInt();
        }

        for(int i =0;i<n;i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B , (o1,o2)->o2-o1);        //내림 차순

        int ans = 0;
        for(int i =0;i<n;i++){
            ans += (A[i]*B[i]);
        }
        System.out.println(ans);

    }
}
