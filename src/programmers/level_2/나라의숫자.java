package programmers.level_2;

public class 나라의숫자 {
    public static void main(String[] args) {
        System.out.println(solution(1));    //result -> 1
        System.out.println(solution(2));    //result -> 2
        System.out.println(solution(3));    //result -> 4
        System.out.println(solution(4));    //result -> 11
    }

    static String solution(int n){
        StringBuilder sb = new StringBuilder();

        while (n > 0){
            int remainder = n%3;
            n/= 3;

            if( remainder ==0){
                remainder = 4;
                n--;
            }
            sb.insert(0, remainder);
        }

        return sb.toString();
    }
}
