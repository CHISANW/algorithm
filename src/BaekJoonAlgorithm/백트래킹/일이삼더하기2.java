package BaekJoonAlgorithm.백트래킹;

import java.util.*;

public class 일이삼더하기2 {
    static int n,k;
    static int[] arr= {1,2,3};
    static List<String> stringList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        backtracking(0, new ArrayList<>());

        Collections.sort(stringList);

        if (stringList.size() < k ||stringList.get(k-1) == null){
            System.out.println(-1);
        }else {
            System.out.println(stringList.get(k-1));
        }

    }
    static void backtracking(int sum, List<Integer> list){
        if (sum == n){
            StringBuilder sb = new StringBuilder();
            for (int i =0; i<list.size()-1;i++){
                sb.append(list.get(i)+"+");
            }
            sb.append(list.get(list.size()-1));
            stringList.add(sb.toString().trim());
        }

        if (sum >n ){
            return;
        }
        for (int i =0; i<3;i++){
            list.add(arr[i]);
            backtracking(sum+arr[i],list);
            list.remove(list.size()-1);
        }
    }
}
