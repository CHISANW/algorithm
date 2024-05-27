package programmers.해쉬;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution(n,words)));     //result -> [3,3]

        int n1 = 5;
        String[] words1 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        System.out.println(Arrays.toString(solution(n1,words1)));   //result -> [0,0]

        int n2 = 2;
        String[] words2 = {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(solution(n2,words2)));   //result -> [1,3]

    }

    static int[] solution(int n, String[] words){

        Set<String> set = new HashSet<>();

        //최초 설정
        char word = words[0].charAt(0);

        for(int i =0;i<words.length;i++){
            if(set.contains(words[i]) || words[i].charAt(0)!=word){
                return new int[]{(i%n)+1, i/n+1};
            }

            set.add(words[i]);

            word = words[i].charAt(words[i].length()-1);
        }

        return new int[]{0,0};
    }
}
