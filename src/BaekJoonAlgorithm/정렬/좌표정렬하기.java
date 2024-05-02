package BaekJoonAlgorithm.정렬;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class 좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        int[][] arr = new int[N][2];

        for (int i= 0;i<N;i++){
            arr[i][0] = stdIn.nextInt();
            arr[i][1] = stdIn.nextInt();
        }

        Arrays.sort(arr,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i =0;i<N;i++){
           for (int j =0;j<2;j++){
               bw.write(arr[i][j]+" ");
           }
           bw.write("\n");
       }
        bw.flush();
        bw.close();

    }
}
