package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        if(!line.contains("X")){
            System.out.println(line);
            return;
        }

        StringBuilder sb = new StringBuilder();
        String[] split = line.split("\\.", -1);

        for(int i =0; i<split.length;i++){

            String s= split[i];

            if(s.length() ==0){
                sb.append(".");
                continue;
            }

            if(s.length()%2 != 0){
                System.out.println(-1);
                return;
            }

            int a = s.length() /4;
            int b = (s.length()%4)/2;

            sb.append("AAAA".repeat(a));
            sb.append("BB".repeat(b));

            if(i != split.length-1)
                sb.append(".");

        }
        System.out.println(sb.toString());
    }
}
