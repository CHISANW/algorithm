package programmers.트리;

import java.util.*;

public class 트리순회 {
    public static void main(String[] args) {
        int[] nodes = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(solutions(nodes)));

    }

    static String[] solutions(int[] nodes){
        String[] ans = new String[3];
        ans[0] = in(nodes,0).trim();    // 전위   부모->좌->우
        ans[1] = post(nodes,0).trim();   // 중위   좌->부모->우
        ans[2] = fre(nodes,0).trim();    // 후위   죄->우->부모
        return ans;
    }

    static String in(int[] nodes ,int idx){
        if(idx>=nodes.length){
            return "";
        }

        return nodes[idx]+" "+
                in(nodes,2*idx+1)+        // 왼쪽
                in(nodes,2*idx+2);            // 오른쪽
    }

    static String post(int[] nodes, int idx){
        if(idx>=nodes.length){
            return "";
        }

        return post(nodes,2*idx+1)+
                nodes[idx]+" "+
                post(nodes, 2*idx+2);
    }

    static String fre(int[] nodes, int idx){
        if(idx>=nodes.length){
            return "";
        }

        return fre(nodes,2*idx+1)+
                fre(nodes,2*idx+2)+
                nodes[idx]+ " ";
    }
}
