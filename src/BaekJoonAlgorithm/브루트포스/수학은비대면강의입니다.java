package BaekJoonAlgorithm.브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class 수학은비대면강의입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for (int i =-999;i<=999;i++){
            for (int k = -999;k<=999;k++){
                if (a*i+b*k==c){
                    if (d*i+e*k==f){
                        bw.write(i+" "+k+"\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
