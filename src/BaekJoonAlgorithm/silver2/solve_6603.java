package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_6603 {
    static int[] arr;
    static int[] result;
    static int k;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            k  = Integer.parseInt(st.nextToken());
            if(k ==0) break;

            arr = new int[k];
            result = new int[6];

            for(int i =0; i<k;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }


            backtracking(0,0);
            System.out.println();
        }


    }

    static void backtracking(int value, int depth){
        if(depth == 6){
            for(int i = 0; i<6;i++){
                System.out.print(result[i] +" ");
            }
            System.out.println();
            return;
        }

        for(int i = value; i<k;i++){
            result[depth] = arr[i];
            backtracking(i+1,depth+1);
        }
    }
}
