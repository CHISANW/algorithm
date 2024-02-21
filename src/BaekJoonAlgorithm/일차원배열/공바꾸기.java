package BaekJoonAlgorithm.일차원배열;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 10813번
 */
public class 공바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        int[] n = new int[a];
        for (int i=1;i<=n.length;i++){
            n[i-1]=i;
        }
        for (int k=0;k<b;k++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            for(int d=i; d<j;i++,j--){
                int temp = n[i-1];
                n[i-1]=n[j-1];
                n[j-1]=temp;
            }
        }
        for (int i =0;i<n.length;i++){
            sb.append(n[i]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}
