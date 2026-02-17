package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_16945 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] in = new int[9];

        for(int i =0; i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<3;j++){
                in[i *3 +j] = Integer.parseInt(st.nextToken());
            }
        }
        int ans = calculateTransformationCost(in);
        System.out.println(ans);
    }

    private static int calculateTransformationCost(int[] in) {
        int[][] squares = {
                {8,1,6,3,5,7,4,9,2},
                {6,1,8,7,5,3,2,9,4},
                {4,9,2,3,5,7,8,1,6},
                {2,9,4,7,5,3,6,1,8},
                {8,3,4,1,5,9,6,7,2},
                {4,3,8,9,5,1,2,7,6},
                {6,7,2,1,5,9,8,3,4},
                {2,7,6,9,5,1,4,3,8}
        };

        int ans = Integer.MAX_VALUE;

        for(int[] s : squares){
            int cost = 0;
            for(int i =0; i< 9;i++){
                cost += Math.abs(in[i] - s[i]);
            }
            ans = Math.min(ans, cost);
        }
        return ans;
    }
}
