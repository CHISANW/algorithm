package programmers.level_2;

import java.util.*;

public class n진수게임 {
    public static void main(String[] args) {

        System.out.println(solution(2,4,2,1));      //result -> 0111
        System.out.println(solution(16,16,2,1));    //result -> 02468ACE11111111
        System.out.println(solution(16,16,2,2));     //result -> 13579BDF01234567
    }
    public static String solution(int n, int t, int m, int p) {
        List<Character> list = new ArrayList<>();
        list.add('0');

        int limit = t * m * 2;
        for(int i= 1; i<=limit;i++){
            String jin = Integer.toString(i,n);
            for(char c : jin.toCharArray()){
                if(c>=97 && c<=122){
                    c = (char)(c-32);
                }
                list.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i =p-1; i<list.size();i+=m){
            if(sb.length() == t) break;
            sb.append(list.get(i));
        }

        return sb.toString();
    }
}
