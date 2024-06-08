package programmers.level_2;

import java.util.*;

public class 전화번호목록 {
    public static void main(String[] args) {
        String[] phone_numbers = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_numbers));        //result -> false

        String[] phone_numbers1 = {"123","456","789"};
        System.out.println(solution(phone_numbers1));        //result -> true

        String[] phone_numbers2 = {"12","123","1235","567","88"};
        System.out.println(solution(phone_numbers2));        //result -> false
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0; i< phone_book.length-1;i++){
            if(phone_book[i + 1].startsWith(phone_book[i])) answer = false;
        }
        return answer;
    }
}
