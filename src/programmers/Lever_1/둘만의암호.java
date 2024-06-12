package programmers.Lever_1;

import java.util.HashSet;
import java.util.Set;

public class 둘만의암호 {

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        System.out.println(solution(s,skip,index));
    }

    public static String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        Set<Character> set = new HashSet<>();
        for(char c : skip.toCharArray()){
            set.add(c);
        }

        for(char c : s.toCharArray()){
            int count = 0;
            char current = c;

            while (count<index){
                current = (char)('a'+ (current -'a'+1) % 26);
                if(!set.contains(current)){
                    count++;
                }
            }
            sb.append(current);
        }

        return sb.toString();
    }
}
