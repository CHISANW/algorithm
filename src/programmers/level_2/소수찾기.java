package programmers.level_2;

import java.util.*;
public class 소수찾기 {
    public static void main(String[] args) {
        String numbers ="17";
        System.out.println(solution(numbers));      //result -> 3

        String numbers1 ="011";
        System.out.println(solution(numbers1));     //result -> 2
    }

    static int[] arr;
    static boolean[] check;
    static Set<Integer> set = new HashSet<>();
    public static int solution(String numbers) {
        String[] split = numbers.split("");
        arr = new int[numbers.length()];
        check = new boolean[numbers.length()];

        for(int i = 0;i<split.length;i++){
            arr[i] = Integer.parseInt(split[i]);
        }

        bfs(0,"");

        return set.size();
    }

    static void bfs(int depth, String number) {
        if(!number.isEmpty()){
            int intNum = Integer.parseInt(number);
            if(validPrime(intNum)){
                set.add(intNum);
            }
        }
        if (depth == arr.length) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!check[i]) {
                check[i] = true;
                String n = String.valueOf(arr[i]);
                bfs( depth + 1, number + n);
                check[i] = false;
            }
        }
    }

    static boolean validPrime(int number){
        if(number ==0 || number == 1) return false;
        for(int i =2;i<number;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
