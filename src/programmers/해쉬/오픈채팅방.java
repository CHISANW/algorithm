package programmers.해쉬;

import java.util.*;

public class 오픈채팅방 {
    public static void main(String[] args){

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        //result ->["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
        System.out.println(Arrays.toString(solution(record)));
    }

    public static String[] solution(String[] record) {

        Map<String,String> res = new HashMap<>();
        res.put("Enter","님이 들어왔습니다.");
        res.put("Leave","님이 나갔습니다.");
        Map<String, String> members  = new HashMap<>();

        for(String str : record){
            String[] cmd = str.split(" ");      //cme[0] -> {Enter, Leave, Change}가 포함된다.
            if(cmd.length==3)
                members.put(cmd[1],cmd[2]);
        }

        List<String> ans = new ArrayList<>();

        for(String s : record){
            String[] cmd = s.split(" ");
            if(res.containsKey(cmd[0])){
                ans.add(members.get(cmd[1])+res.get(cmd[0]));
            }
        }

        return ans.toArray(new String[0]);
    }
}
