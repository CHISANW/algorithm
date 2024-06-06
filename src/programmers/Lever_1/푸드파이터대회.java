package programmers.Lever_1;

public class 푸드파이터대회 {
    public static void main(String[] args) {
        int[] food ={1,3,4,6};
        System.out.println(solution(food));     //result -> 1223330333221
    }

    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1;i<food.length;i++){
            int j = food[i]/2;
            for(int k = 0;k<j;k++){
                sb.append(i);
            }
        }
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();

        return s1+"0"+s2;
    }
}
