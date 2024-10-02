package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 빗물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] heights = new int[w];

        for (int i = 0; i<w;i++){
            heights[i] = sc.nextInt();
        }

        int[] leftMax = new int[w];
        int[] rightMax = new int[w];

        leftMax[0] = heights[0];
        for (int i =1;i<w;i++){
            leftMax[i] = Math.max(leftMax[i-1],heights[i]);
        }

        rightMax[w-1] = heights[w-1];
        for (int i = w-2; i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }

        int count = 0;
        for (int i =0; i<w;i++){
            int waterHeight = Math.min(leftMax[i], rightMax[i]) - heights[i];
            if (waterHeight>0){
                count += waterHeight;
            }
        }
        System.out.println(count);
    }
}
