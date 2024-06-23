package programmers.level_2;
import  java.util.*;

public class 뉴스클러스터링 {
    public static void main(String[] args) {

        System.out.println(solution("FRANCE","french"));            //result ->     16384

        System.out.println(solution("handshake","shake hands"));     //result ->    65536

        System.out.println(solution("aa1+aa2","AAAA12"));            //result ->    43690

        System.out.println(solution("E=M*C^2","e=m*c^2"));           //result ->    65536

    }

    public static int solution(String str1, String str2) {
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        float union = 0;
        float intersection = 0;

        for(int i = 0 ;i<str1.length()-1;i++){
            String s = (String.valueOf(str1.charAt(i))+ String.valueOf(str1.charAt(i+1))).toLowerCase();
            boolean valid = !s.matches("[a-zA-Z]*");
            if(!valid){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }

        for(int i = 0 ;i<str2.length()-1;i++){
            String s = (String.valueOf(str2.charAt(i))+ String.valueOf(str2.charAt(i+1))).toLowerCase();
            boolean valid = !s.matches("[a-zA-Z]*");
            if(!valid){
                map2.put(s,map2.getOrDefault(s,0)+1);
            }
        }

        if(map.isEmpty() && map2.isEmpty()) return 65536;

        Set<String> keySet = new HashSet<>();

        for(Map.Entry<String,Integer> maps : map.entrySet()){
            String key = maps.getKey();
            int value = maps.getValue();
            if(map2.containsKey(key)){
                union += Math.min(value,map2.get(key));
                intersection += Math.max(value,map2.get(key));
            }else{
                intersection +=value;
            }

            for(String map2Key : map2.keySet()){
                if(!map.containsKey(map2Key)){
                    keySet.add(map2Key);

                }
            }
        }

        for(String key : keySet){
            intersection+= map2.get(key);
        }
        int sum =(int) ((union/intersection)*65536);


        return sum;
    }
}
