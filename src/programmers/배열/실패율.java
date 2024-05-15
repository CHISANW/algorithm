package programmers.배열;

import java.util.*;

//2019 KAKAO BLIND RECRUITMENT
public class 실패율 {
    public static void main(String[] args){

        int n1 = 5;
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(n1, stages1)));// result -> [3,4,2,1,5]

        int n2 = 4;
        int[] stages2 = {4,4,4,4,4};
        System.out.println(Arrays.toString(solution(n2,stages2)));       //result -> [4,1,2,3]

    }

    static int[] solution(int N, int[] stages){
        int[] challenger = new int[N+2];            //  N+1의 스테이지가 존재하는데 1부터 검사하기 위해서 +2증가한 배열 초기화

        for(int i=0;i<stages.length;i++){
            challenger[stages[i]] += 1;         // stage의 있는 값을 challenger배열에 증가 ex) challenger[7] = [0,1,2,3,2,0,1]
        }
        
        Map<Integer,Double> fails = new HashMap<>();            //Map 선언
        
        double total = stages.length;                       // int형으로 '/' 진행시 1/5의 대해서는 소숫점을 버리기 때문에 double으로 선언
        
        for(int i=1;i<=N;i++){                              // 스테이지 수만큼 반복
            if(challenger[i]==0){
                fails.put(i,0.);                            // 현재 도전중인 배열에 도착한 인원이 없다면 0 으로 반환
            }else{
                fails.put(i,challenger[i]/total);           // 실패율을 계산하여 맵의 저장
                total -= challenger[i];                     // 인원수 차감 다음 스테이지에는 도달할수없음  ex)-> 1스테이의 1/8 2스테이지 2/(8-1)
            }
        }
        return fails.entrySet().stream().sorted((o1,o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}
