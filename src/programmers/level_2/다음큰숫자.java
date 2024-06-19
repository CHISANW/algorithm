package programmers.level_2;

public class 다음큰숫자 {
    public static void main(String[] args) {
        int n = 78;
        System.out.println(solution(n));        //result -> 83

        int n1 = 15;
        System.out.println(solution(n1));       //result -> 15

    }

    public static int solution(int n) {

        int now = Integer.toString(n, 2).replace("0","").length();
        for(int i =n+1 ; ; i++){
            int next = Integer.toString(i,2).replace("0","").length();
            if(now == next) return i;
        }

    }

}
