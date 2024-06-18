package programmers.Level_1;

public class 기사단원의무기 {
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;

        System.out.println(solution(number,limit,power));   //result -> 10
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new  int[number];

        for(int i = 1; i<=number;i++){
            int count = 0;
            for(int j = 1; j*j<=i;j++){
                if(i%j == 0){
                    count++;
                    if(j != i/j){
                        count++;
                    }
                }
            }
            arr[i-1] = count;
        }

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>limit){
                arr[i] = power;
            }
            answer+= arr[i];
        }

        return answer;
    }
}
