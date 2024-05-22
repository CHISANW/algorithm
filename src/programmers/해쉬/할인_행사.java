package programmers.해쉬;

import java.util.*;

public class 할인_행사 {
    public static void main(String[] args) {

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount ={"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want,number,discount));     //result -> 3


        String[] want1 = {"apple"};
        int[] number1 = {10};
        String[] discount1 ={"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
        System.out.println(solution(want1,number1,discount1));     //result -> 0

    }

    static int solution(String[] want,int[] number,String[] discount){
        int ans=0;

        Map<String,Integer> map = new HashMap<>();
        for(int i =0; i<want.length;i++){
            map.put(want[i],number[i]);
        }

        for(int i =0;i<discount.length-9;i++){
            Map<String,Integer> dis = new HashMap<>();

            for(int j =i; j<i+10;j++){
                if(map.containsKey(discount[j])){
                    dis.put(discount[j],dis.getOrDefault(discount[j],0)+1);
                }
            }
            if(map.equals(dis)){
                ans++;
            }
        }


        return ans;
    }
}
