package programmers.level_2;

public class 마법의엘리베이터 {
    public static void main(String[] args) {
        System.out.println(solution(16)); //result -> 6
        System.out.println(solution(2554)); //result -> 16
    }

    public static int solution(int storey) {
        int answer = 0;

        while(storey > 0){
            int temp = storey%10; // 1의 자리수 계산
            storey /= 10;

            if (temp > 5 || (temp == 5 && storey % 10 >= 5)) {
                answer += (10 - temp);
                storey += 1;
            } else {
                answer += temp;
            }
        }
        return answer;
    }
}
