package BaekJoonAlgorithm.일차원배열;

import java.io.*;

public class 수배열하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10001];

        int a = Integer.parseInt(br.readLine());
        for (int i=0;i<a;i++){
            arr[Integer.parseInt(br.readLine())]++;
        }


        for (int i =1; i<=10000;i++){
            while (arr[i]-- >0){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
