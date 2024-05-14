package programmers.배열;

import java.util.*;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        int[] arr = {5,0,2,7};

        int[] result =solution(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] solution(int[] arr){
        List<Integer> a = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                a.add(arr[i]+arr[j]);
            }
        }
        int[] array = a.stream().distinct().mapToInt(Integer::intValue).toArray();
        Arrays.sort(array);
        return array;
    }
}
