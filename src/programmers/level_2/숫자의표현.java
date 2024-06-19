package programmers.level_2;

public class 숫자의표현 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int count = 0;
        for(int i = 1; i<=n;i++){
            int sum =0;
            for(int j = i;j<=n;j++){
                sum+=j;
                if(sum >= n){
                    if(sum == n)  count++;
                    break;
                }
            }
        }
        return count;
    }
}
