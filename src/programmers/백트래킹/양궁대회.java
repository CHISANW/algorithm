package programmers.백트래킹;

import java.util.Arrays;

public class 양궁대회 {
    public static void main(String[] args) {
        int n = 5;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(solution(n,info)));
    }

    static int[] apache;
    static int[] answer;
    static int max;
    static int[] solution(int n, int[] info) {      //n 은 양궁의 수
        
        apache = info;      // 전역 스택으로 올리기
        max = 0;
        
        back(n,0,new int[11]);

        return max ==0 ? new int[]{0} : answer;
    }

    static void back(int arrows, int idx,int[] ryan ){

        if(arrows == 0){
            calculator(ryan);
            return;
        }

        for(int i = idx ;i<=10;i++){
           int cnt = Math.min(arrows, apache[i]+1);
           ryan[i] =cnt;
           back(arrows - cnt, idx+1,ryan);
           ryan[i] = 0;
        }
    }

    static void calculator(int[] ryun){        // 라이언이 사용할수있는 양궁인지 더함
        int sum = getResult(ryun);      //라이언의 양궁의 합을 찾아온다.
        if(sum > max){                  // 합이 현재 max값 보다 클떄
            max = sum;     // max값을 재배치하고
            answer = ryun.clone();       // 정답의 라이온 배열의 값을 복사
        }else if (max >0 && sum == max){    // 문제 조건의 만들수 있는 방법이 여러개일때는 낮은 점수를 맞힌 경우를 return해라는 조건이 있음
            for(int i =10; i>=0;i--){
                if(answer[i] != ryun[i]){
                    if(answer[i]< ryun[i]){
                        answer = ryun.clone();
                    }
                    break;
                }
            }
        }
    }
    static int getResult(int[] ryun){       // 양궁의 합을 더함
        int sum = 0;
        for(int i = 0;i<=10;i++){
            if(apache[i]+ryun[i]> 0)
             sum += ryun[i] > apache[i] ? 10-i : -(10-i);
        }
        return sum;
    }

}
