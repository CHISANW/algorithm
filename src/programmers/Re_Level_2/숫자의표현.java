package programmers.Re_Level_2;

public class 숫자의표현 {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    static int solution(int n) {
        int count = 1;
        for(int i =1; i<n; i++){
            int sum = i;
            for(int j = i +1;j<n;j++){
                if(sum + j < n){
                    sum += j;
                }else if(sum + j == n){
                    count++;
                    break;
                }else if(sum + j > n){
                    break;
                }
            }
        }
        return count;
    }
}
