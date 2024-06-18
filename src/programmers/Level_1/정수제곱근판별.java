package programmers.Level_1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        long n = 121l;
        System.out.println(solution(n));
    }
    static long solution(long n){
        long count = -1;
        for(long i = 1; ;i++){
            if(n==i*i){
                count = i+1;
                break;
            }
            if(i>n){
                break;
            }
        }
        return count == -1 ? -1 : count*count;
    }
}
