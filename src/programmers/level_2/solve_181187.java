package programmers.level_2;

public class solve_181187 {
    public static void main(String[] args) {
        System.out.println(solution(2,3));
    }

    static long solution(int r1, int r2){
        long answer = 0;

        for (int i=1; i<=r2; i++) {
            long minJ = (int) Math.ceil(Math.sqrt(1.0*r1*r1 - 1.0*i*i));
            long maxJ = (int) Math.floor(Math.sqrt(1.0*r2*r2 - 1.0*i*i));

            answer += (maxJ - minJ + 1);

        }

        return answer * 4;
    }
}
