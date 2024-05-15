package programmers.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] arg){
        int[] arr =  {5, 9, 7, 10};
        int div=  5;
        int[] solution = solution(arr, div);        //result - >	[5, 10]
        System.out.println(Arrays.toString(solution));

        int[] arr1 =  {3,2,6};
        int div1=  5;
        int[] solution1 = solution(arr1, div1);         // result -> [-1]
        System.out.println(Arrays.toString(solution1));
    }

    public static int[] solution(int[] arr, int div) {

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%div == 0){
                ans.add(arr[i]);
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }

        return  ans.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
