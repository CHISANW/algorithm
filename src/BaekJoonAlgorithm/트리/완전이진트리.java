package BaekJoonAlgorithm.트리;

import java.util.*;

public class 완전이진트리 {
    static int[] node;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = (int)Math.pow(2,n)-1;
        node = new int[size];

        for(int i =0;i<node.length;i++){
            node[i] = sc.nextInt();
        }

        Map<Integer,ArrayList<Integer>> tree=  new HashMap<>();

        findin(0,size-1,0,tree);

        for(Integer in :tree.keySet()){
            ArrayList<Integer> list=tree.get(in);
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

    static void findin(int start, int end, int depth,Map<Integer,ArrayList<Integer>> map){
        int mid = (start + end) / 2;
        ArrayList<Integer> list = map.getOrDefault(depth, new ArrayList<>());
        list.add(node[mid]);
        map.put(depth,list);

        if(start == end) return;


        findin(start, mid-1,depth+1,map);        // 왼쪽
        findin(mid+1, end,depth+1,map);        // 오른쪽
    }
}
