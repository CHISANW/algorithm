package BaekJoonAlgorithm.구현;

import java.util.*;

public class 숫자정사격형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i =0; i<n;i++){
            String line =sc.next();
            for(int j =0;j<m;j++){
                arr[i][j] = line.charAt(j)-'0';
            }
        }

        int maxArea = 0;

        for(int i= 0; i<n;i++){
            for (int j =0; j<m;j++){
                for (int size = 1;size<=Math.min(n-i, m-j);size++){
                    int x = i;
                    int y = j;
                    int x1 = i + size - 1;
                    int y1 = j + size - 1;

                    if (x1>=n || y1>=m) break;

                    int topLeft = arr[x][y];
                    int topRight = arr[x][y1];

                    int bottomLeft = arr[x1][y];
                    int bottomRight = arr[x1][y1];

                    if (topLeft == topRight && topRight == bottomLeft && bottomLeft == bottomRight){
                        maxArea = Math.max(maxArea,size*size);
                    }
                }
            }
        }

        System.out.println(maxArea);
    }
}
