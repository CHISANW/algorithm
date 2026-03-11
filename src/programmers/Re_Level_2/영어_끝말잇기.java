package programmers.Re_Level_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 영어_끝말잇기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));

    }

    static  int[] solution(int n, String[] words) {
        int peopleIndex = 1;
        Set<String> usedWords = new HashSet<>();
        int[] answer = new int[]{0,0};
        String befWord = words[0];
        usedWords.add(words[0]);
        for(int i = 1; i<words.length;i++){
            peopleIndex = (i+1)%n;
            if(peopleIndex == 0) peopleIndex = n;
            if(usedWords.contains(words[i])){
                return new int[]{peopleIndex, i/n+1};
            }

            if(befWord.charAt(befWord.length()-1) != words[i].charAt(0)){
                return new int[]{peopleIndex, i/n+1};
            }
            usedWords.add(words[i]);
            befWord = words[i];
        }
        return answer;
    }
}
