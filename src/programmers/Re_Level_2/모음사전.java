package programmers.Re_Level_2;

public class 모음사전 {

    static char[] vowels = {'A','E','I','O','U'};
    static String ex;
    static int count, ans;
    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));      // result -> 6
        System.out.println(solution("AAAE"));       // result -> 10
        System.out.println(solution("I"));          // result -> 1563
        System.out.println(solution("EIO"));        // result -> 1189
    }

    static int solution(String word) {
        ex = word;
        count = 0;
        ans = 0;
        backtracking(0, "");
        return ans;
    }

    static void backtracking(int depth, String alp){

        if(alp.equals(ex)){
            ans = count;
            return;
        }

        if(depth == 5){
            return;
        }

        for(int i = 0; i < 5;i++){
            count++;
            backtracking(depth+1, alp+String.valueOf(vowels[i]));
        }

    }
}
