package BaekJoonAlgorithm.테스트;

import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();    // 듣도 못한 사람의 수
        int M = stdIn.nextInt();    // 보도 못한 사람의 수


        Set<String> unhear = new TreeSet<>();
        for (int i =0;i<N;i++){
            unhear.add(stdIn.next());
        }

        List<String> inHear = new ArrayList<>();
        for (int i = 0;i<M;i++){
            String name = stdIn.next();
            if (unhear.contains(name)){
                inHear.add(name);
            }
        }

        Collections.sort(inHear);

        System.out.println(inHear.size());
        for (String ans : inHear){
            System.out.println(ans);
        }
    }

}
