package programmers.level_2;

public class 모음사전 {
    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));      // result -> 6
        System.out.println(solution("AAAE"));       // result -> 10
        System.out.println(solution("I"));          // result -> 1563
        System.out.println(solution("EIO"));        // result -> 1189

    }

    static char[] aplha = {'A','E','I','O','U'};
    static char[] cmd;
    static String ex;
    static int count;
    static int answer;
    public static int solution(String word) {
        ex = word;
        cmd = word.toCharArray();

        count = 0;
        answer = 0;
        dfs(0,"");

        return answer;
    }

    static void dfs(int depth,String alp){

        if(alp.equals(ex)){
            answer = count;
            return;
        }
        if(depth == 5){
            return;
        }

        for(int i = 0;i<aplha.length;i++){
            count++;
            dfs(depth+1,alp+String.valueOf(aplha[i]));
        }
    }
}
