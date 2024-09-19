package BaekJoonAlgorithm.브루트포스;

import java.util.*;

public class 가장가까운세사람의심리적거리 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            String[] people = new String[n];
            for (int i =0;i<n;i++){
                people[i] = sc.next();
            }

            if (n < 3) {
                System.out.println(0);
                continue;
            }

            Map<String, Integer> count = new HashMap<>();
            boolean found = false;
            for (String mbti : people) {
                count.put(mbti, count.getOrDefault(mbti, 0) + 1);
                if (count.get(mbti) >= 3) {  // 같은 MBTI가 3명 이상이면 심리적 거리 0
                    System.out.println(0);
                    found = true;
                    break;  // 이 테스트 케이스는 더 이상 계산할 필요 없음
                }
            }

            if (found) {
                continue;  // 다음 테스트 케이스로 넘어가기
            }

            int min = Integer.MAX_VALUE;

            for (int i =0; i<n;i++){
                for (int j = i+1; j<n;j++){
                    for (int k = j+1; k<n;k++){
                        int totalValue = totalValue(people[i], people[j], people[k]);
                        min = Math.min(totalValue,min);
                    }
                }
            }
            System.out.println(min);
        }
    }

    static int getDistance(String a, String b){
        int distance = 0;
        for (int i =0; i<4;i++){
            if (a.charAt(i) != b.charAt(i)){
                distance++;
            }
        }
        return distance;
    }

    static int totalValue(String a, String b, String c){
        return getDistance(a,b) + getDistance(b,c) + getDistance(a,c);
    }


}
