package programmers.Lever_1;

import java.util.Arrays;

/**
 * 다른사람 풀이
 * class Solution {
 *   public String[] solution(int n, int[] arr1, int[] arr2) {
 *         String[] result = new String[n];
 *         for (int i = 0; i < n; i++) {
 *             result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
 *         }
 *
 *         for (int i = 0; i < n; i++) {
 *             result[i] = String.format("%" + n + "s", result[i]);
 *             result[i] = result[i].replaceAll("1", "#");
 *             result[i] = result[i].replaceAll("0", " ");
 *         }
 *
 *         return result;
 *     }
 * }
 */
public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.toString(solution(n,arr1,arr2)));

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        int[][] check = new int[n][n];

        for(int i = 0; i<arr1.length;i++){
            String two = Integer.toBinaryString(arr1[i]);
            if(two.length()<n){
                int need = n - two.length();
                for(int zero= 0;zero<need;zero++){
                    sb.append("0");
                }
            }
            char[] cmd = sb.append(two).toString().toCharArray();

            for(int c = 0; c <cmd.length;c++){
                if(cmd[c] == '1') {
                    check[i][c] = 1;
                }
            }
            sb.setLength(0);

        }

        for(int i = 0; i<arr2.length;i++){
            String two = Integer.toBinaryString(arr2[i]);
            if(two.length()<n){
                int need = n - two.length();
                for(int zero= 0;zero<need;zero++){
                    sb.append("0");
                }
            }
            char[] cmd = sb.append(two).toString().toCharArray();

            for(int c = 0; c <cmd.length;c++){
                if(cmd[c] == '1') {
                    check[i][c] = 1;
                }
            }
            sb.setLength(0);

        }

        String[] answer = new String[n];

        for(int i = 0; i<n;i++){
           for(int j = 0; j<n;j++){
               if(check[i][j]==1){
                   sb.append("#");
               }else sb.append(" ");
           }
           answer[i] = sb.toString();
           sb.setLength(0);
       }

        return answer;
    }
}
