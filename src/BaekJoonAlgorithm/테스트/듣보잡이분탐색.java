package BaekJoonAlgorithm.테스트;

import java.util.*;

public class 듣보잡이분탐색 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        String[] arr = new String[N];
        for (int i =0;i<N;i++){
            arr[i]= stdIn.next();
        }

        Arrays.sort(arr);

        List<String> ans = new ArrayList<>();
        for (int i =0;i<M;i++){
            String name = stdIn.next();
            if (Arrays.binarySearch(arr,name) >=0){
                ans.add(name);
            }
        }

        Collections.sort(ans);

        System.out.println(ans.size());
        for (String ans1 : ans){
            System.out.println(ans1);
        }
    }
}
