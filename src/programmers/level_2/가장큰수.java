package programmers.level_2;

import java.util.*;

public class 가장큰수 {
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        System.out.println(solution(numbers));  // result - "6210"

        int[] numbers1 = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers1));  // result - "6210"
    }

    static String solution(int[] numbers){

        List<String> list = new ArrayList<>();

        for(int number : numbers){
            list.add(String.valueOf(number));
        }

        list.sort((o1, o2) -> {
            int a = Integer.parseInt(o1 + o2);
            int b = Integer.parseInt(o2 + o1);

            return Integer.compare(b,a);
        });

        StringBuilder sb = new StringBuilder();
        for(String i : list){
            sb.append(i);
        }
        return sb.charAt(0) == '0'? "0" : sb.toString();
    }
}
