package programmers.Lever_1;

public class 약수의합 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));    //result => 28
    }
    public static int solution(int n) {
        int i =1;
        int sum = 0;
        while(i <=n){
            if(n%i == 0){
                sum+= i;
            }
            i++;
        }

        return sum;
    }
}
