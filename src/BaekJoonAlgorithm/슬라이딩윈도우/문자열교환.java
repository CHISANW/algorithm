package BaekJoonAlgorithm.슬라이딩윈도우;

import java.util.Scanner;

public class 문자열교환 {
    static char[] line;
    static int size = 0, length;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        line = sc.next().toCharArray();
        length = line.length;

        for (char c : line) {
            if (c=='a') size++;
        }

        int ans = Integer.MAX_VALUE;
        for (int i=0;i<length;i++){
            String s = slideWindow(i);
            int count = 0;
            for (int j = 0; j<s.length();j++){
                if (s.charAt(j) == 'b') count++;
            }
            ans = Math.min(ans,count);
        }
        System.out.println(ans);
    }

    static String slideWindow(int start){
        StringBuilder sb = new StringBuilder();
        for (int i= 0; i<size;i++){
            int index = (start+i) % length;
            sb.append(line[index]);
        }
        return sb.toString();
    }
}
