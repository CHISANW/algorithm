package programmers.level_2;

public class solve_12911 {
    public static void main(String[] args) {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }

    static int solution(int n){

        int now = Integer.toString(n,2).replace("0" , "").length();

        for(int i = n+1; ; i++){
            int length = Integer.toString(i, 2).replace("0", "").length();
            if(now == length) return i;
        }
    }
}
