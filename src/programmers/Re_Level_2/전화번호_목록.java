package programmers.Re_Level_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 전화번호_목록 {
    public static void main(String[] args) {

        System.out.println(solution(new String[]{"119","97674223","827362695","82107038"}));
        System.out.println(solution(new String[]{"123","456","789"}));
        System.out.println(solution(new String[]{"12","123","1235","567","88"}));

    }

    static boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));
        for(int i=0;i<phone_book.length;i++){
            for(int j = 1; j<phone_book[i].length();j++){
                String substring = phone_book[i].substring(0, j);
                if(set.contains(substring)) return false;
            }
        }
        return true;
    }
}
