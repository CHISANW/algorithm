package programmers.level_2;

public class 점프와순간이동 {
    public static void main(String[] args) {
        System.out.println(solution(5));        //result -> 2
        System.out.println(solution(10));       //result -> 2
        System.out.println(solution(6));        //result -> 2
    }


    public static int solution(int n){
        int ans = 0;
        while (n>=1){
            if(n%2==0){
                n/=2;
                continue;
            }
            n-=1;
            ans++;
        }
        return ans;
    }
}
