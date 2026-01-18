package programmers.level_2;

public class solve_12924 {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    static int solution(int n){
        int answer = 0;

        for(int i = 1; i<=n;i++){
            int sum = 0;
            for(int j = i; j<=n;j++){
                sum += j;
                if(sum >= n){
                    if(sum == n){
                        answer++;
                    }else{
                        break;
                    }
                }

            }
        }
        return answer;
    }
}
