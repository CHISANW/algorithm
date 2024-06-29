package programmers.level_2;

public class k진수에서소수개수구하기 {
    public static void main(String[] args) {
        System.out.println(solution(437674,3)); // result -> 3
        System.out.println(solution(110011,10)); // result -> 2
    }

    public static int solution(int n, int k) {
        int answer = 0;
        String converted = Integer.toString(n, k);

        String[] parts = converted.split("0");
        for (String part : parts) {
            if (!part.isEmpty() && isPrime(parseDecimal(part))) {
                answer++;
            }
        }

        return answer;
    }

    private static long parseDecimal(String s) {
        return Long.parseLong(s, 10);
    }

    private static boolean isPrime(long n) {
        if(n==1)return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
