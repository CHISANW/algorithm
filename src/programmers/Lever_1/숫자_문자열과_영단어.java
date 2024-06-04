package programmers.Lever_1;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        String s ="one4seveneight";
        System.out.println(solution(s));    //result -> 1478

        String s1 ="23four5six7";
        System.out.println(solution(s1));   //result -> 234567

        String s2 ="2three45sixseven";
        System.out.println(solution(s2));   //result -> 234567

        String s3 ="123";
        System.out.println(solution(s3));   //result -> 123
    }

    public static int solution(String s) {

        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        String ans =s;
        for(int i = 0; i<str.length;i++){
            ans = ans.replace(str[i], String.valueOf(i));
        }

        return Integer.parseInt(ans);
    }
}
