package BaekJoonAlgorithm.투포인터;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제번호 3273번
 */
public class 두수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int d = Integer.parseInt(br.readLine());
        int[] a= new int[d];
         int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int s = 0; s<d;s++){
            a[s]=(Integer.parseInt(st.nextToken()));
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(a);

        // 투 포인터 알고리즘 사용
        int left = 0, right = d - 1;
        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == x) {
                result++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }

        bw.write(String.valueOf(result));

        bw.close();
        br.close();
    }
}
