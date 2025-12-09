package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 1; i<=n;i++){
            String value = String.valueOf(i);
            if(value.length()<=2){
                count++;
            }else{
                String[] split = value.split("");
                int minus = Integer.parseInt(split[1]) - Integer.parseInt(split[0]);

                for(int j = 1; j<value.length()-1;j++){
                    if(minus == Integer.parseInt(split[j+1]) - Integer.parseInt(split[j])){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
