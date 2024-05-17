package programmers.스킬체크.레벨1;

public class First_problem_문자열문제 {
    public static void main(String[] args){

        int[] asn ={1, 7, 1, 2};
        System.out.println(solution(asn));
    }

    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<food.length;i++){
            if(food[i]!=1){
                System.out.println(food[i]);
                for(int j =0;j<food[i]/2;j++){
                    sb.append(i);
                }
            }
        }

        String first = sb.toString();
        String reverse = sb.reverse().toString();

        return first+"0"+reverse;
    }

}
