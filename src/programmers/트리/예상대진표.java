package programmers.트리;

public class 예상대진표 {
    public static void main(String[] args) {

        int n = 8;
        int a = 4;
        int b = 7;
        System.out.println(solution(n,a,b));        //result -> 3
    }

    public static int solution(int n, int a, int b){

        int ans = 0;

        for(int i =0; a!=b;ans++){
            a = (a+1)/2;
            b = (b+1)/2;
        }

        return ans;
    }
}
