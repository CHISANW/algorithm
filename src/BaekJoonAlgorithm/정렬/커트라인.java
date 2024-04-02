package BaekJoonAlgorithm.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 25305번
 * 단순한 선택 정렬을 사용한문제
 */
public class 커트라인 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] sort = new int[n];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0;i<n;i++){
            sort[i] = Integer.parseInt(st.nextToken());
        }

        for (int i =0;i<sort.length-1;i++){
            for (int j= i+1;j<sort.length;j++){
                if (sort[j]>sort[i]){
                    int temp = sort[j];
                    sort[j] = sort[i];
                    sort[i] = temp;
                }
            }
        }
        System.out.println(sort[k-1]);
        br.close();
    }
}
