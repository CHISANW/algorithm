package BaekJoonAlgorithm.백트래킹;

import java.util.Scanner;

public class 숫자재배치 {
    static long a , b;
    static String A,B;
    static int[] visited;
    static long max = 0;
    static String ans ="";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        B = sc.next();

        a = Long.parseLong(A);
        b = Long.parseLong(B);

        visited = new int[10];

        for (int i =0; i< A.length();i++){
            int index = A.charAt(i) - '0';
            visited[index]++;
        }

        backTracking(0,"");
        if (ans.isEmpty() || ans.length()!=A.length()){
            System.out.println(-1);
        }else {
            System.out.println(Long.parseLong(ans));
        }

    }
    static void backTracking(int depth,String value){;
        if (depth == A.length()) {
            if (value.charAt(0) == '0') return;
            long num = Long.parseLong(value);
            if (num > b) {
                return;
            }
            max = Math.max(num, max);
            ans = String.valueOf(max);
            return;
        }

        for (int i=0;i<10;i++){
            if (visited[i] > 0){
                visited[i]--;
                backTracking(depth+1,value+i);
                visited[i]++;
            }
        }
    }
}
