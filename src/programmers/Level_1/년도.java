package programmers.Level_1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12901
public class 년도 {
    public static void main(String[] args) {
        int a = 5;
        int b = 25;

        System.out.println(solution(a,b));
    }

    public static String solution(int a , int b){
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};

        int total = 0;
        for(int i = 0; i<a;i++){
            total+= month[i];
        }

        return days[(total%b) % 7];
    }
}
