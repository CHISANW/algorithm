package programmers.Level_1;

import java.util.*;

public class 숫자짝꿍 {
    public static void main(String[] args) {
        String X = "100",Y = "2345";
        System.out.println(solution(X,Y)); //result -> -1

        String X1 = "100",Y1 = "203045";
        System.out.println(solution(X1,Y1));    //result -> -0

        String X2 = "100",Y2 = "123450";
        System.out.println(solution(X2,Y2));    //result -> -10

        String X3 =  "12321",Y3 = 	"42531"; //result -> 321
        System.out.println(solution(X3,Y3));
    }

    public static String solution(String X, String Y) {
        String answer = "";
        int[] alapha = new int[10];

        List<Integer> list = new ArrayList<>();

        for(char c : Y.toCharArray()){
            int index = c-'0';
            alapha[index]++;
        }

        for(char c : X.toCharArray()){
            int index = c-'0';
            if(alapha[index]>0){
                list.add(index);
                alapha[index]--;
            }
        }

        list.sort((o1,o2) -> Integer.compare(o2,o1));


        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        StringBuilder sb = new StringBuilder();
        if(list.isEmpty()){
            return "-1";
        }else{
            if(arr[0] == 0) return "0";
            for(int i =0;i<arr.length;i++){
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
}
