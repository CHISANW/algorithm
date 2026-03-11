package programmers.Re_Level_2;

import java.util.*;

public class 할인행사 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"} ));
        System.out.println(solution(new String[]{"apple"}, new int[]{10}, new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"} ));
    }

    public static int solution(String[] want, int[] number, String[] discount) {
      Map<String, Integer> wantMap = new HashMap<>();

      for(int i =0; i<want.length;i++){
          wantMap.put(want[i], number[i]);
      }

      int answer = 0;
      for(int i = 0; i<= discount.length- 10; i++){
          Map<String,Integer> map = new HashMap<>(wantMap);

          for(int j = i; j< i+10;j++){
              String item = discount[j];

              if(map.containsKey(item)){
                  map.put(item, map.get(item)-1);
                  if(map.get(item) == 0)
                      map.remove(item);
              }
          }
          if(map.isEmpty()){
              answer++;
          }
      }
      return  answer;
    }
}
