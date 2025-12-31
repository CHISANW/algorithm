package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class solve_16165 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, List<String>> group = new HashMap<>();
        Map<String, String> memberMap = new HashMap<>();

        for(int i = 0; i<n;i++){
            String groupName = br.readLine();
            int memberCount = Integer.parseInt(br.readLine());
            List<String> memberList = new ArrayList<>();
            for(int j =0; j<memberCount;j++){
                String member = br.readLine();
                memberList.add(member);
                memberMap.put(member, groupName);
            }
            Collections.sort(memberList);
            group.put(groupName, memberList);
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<m;i++){
            String query = br.readLine();
            int type = Integer.parseInt(br.readLine());

            if(type == 0 ){
                List<String> members = group.get(query);
                for (String s : members) {
                    sb.append(s).append("\n");
                }
            }else{
                sb.append(memberMap.get(query)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
