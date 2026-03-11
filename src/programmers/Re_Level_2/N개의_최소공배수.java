package programmers.Re_Level_2;

public class N개의_최소공배수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,6,8,1,14}));
        System.out.println(solution(new int[]{1,2,3}));
    }

    static int solution(int[] arr) {
        int result = arr[0];
       for (int i = 0; i < arr.length; i++){
           result = lcm(result,arr[i]);
       }
       return result;
    }

    static int gcd(int a, int b){
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}
