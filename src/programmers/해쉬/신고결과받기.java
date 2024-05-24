package programmers.해쉬;

import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] repost = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list,repost,k)));        //result -> [2,1,1,0]


        String[] id_list1 = {"con", "ryan"};
        String[] repost1 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k1 = 2;
        System.out.println(Arrays.toString(solution(id_list1,repost1,k1)));      //result -> [0,0]

    }

    public static int[] solution(String[] id_list, String[] reports,int k){

        Map<String,HashSet<String>> map = new HashMap<>();      // HashSet<>은 중복된 데이터를 키 값으로만 저장한다.
        Map<String,Integer> count = new HashMap<>();

        for(String line : reports){
            String[] s = line.split(" ");
            String userId = s[0]; //신고자
            String reportId = s[1]; //신고 당한사람

            if(!map.containsKey(reportId)){
                map.put(reportId, new HashSet<>());
            }
            map.get(reportId).add(userId);
        }

        for(Map.Entry<String,HashSet<String>> entry : map.entrySet()){
            if(entry.getValue().size()>=k){
                for(String uuid : entry.getValue()){
                    count.put(uuid, count.getOrDefault(uuid,0)+1);
                }
            }
        }

        int[] ans = new int[id_list.length];
        for(int i =0;i< id_list.length;i++){
            ans[i] = count.getOrDefault(id_list[i],0);
        }

        return ans;
    }
}
