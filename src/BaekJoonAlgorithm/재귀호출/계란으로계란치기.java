package BaekJoonAlgorithm.재귀호출;

import java.util.*;

public class 계란으로계란치기 {
    static int n;
    static Eggs[] eggs;
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        eggs = new Eggs[n];
        for (int i =0;i<n;i++){
            eggs[i] = new Eggs(sc.nextInt(),sc.nextInt());
        }

        solve(0);
        System.out.println(ans);
    }

    static void solve(int pick){
        //base case 종료조건
        if (pick==n){
            int count = 0;
            for (int i =0;i<n;i++){
                if (eggs[i].durability<=0) count++; //현재 재귀에서 꺠진 달걀의 수 카운트
            }
            ans = Math.max(count,ans);  // 꺠진 달걀의 수 초기화
            return;
        }

        //recursive case
        if (eggs[pick].durability>0){       //현재 재귀에서 꺠진 현재 픽한 계런이 꺠지지 않았다면
            boolean targetEx = false;
            for (int target =0;target<n;target++){
                if (target==pick) continue;
                if (eggs[target].durability>0){         //현재 싸울수 있는 계란일때
                    targetEx=true;
                    eggs[pick].fight(eggs[target]);
                    solve(pick+1);
                    eggs[pick].restore(eggs[target]);
                }
            }
            if (!targetEx)          //타겟이 사용할수 없는 계란이라면
                solve(pick+1);
        }else {                                   //깨젔다면
            solve(pick+1);
        }
    }

    public static class Eggs{
        int weight;
        int durability;


        public Eggs(int d,int w){
            this.durability = d;
            this.weight = w;

        }


        void fight(Eggs eggs){              // 꺠트리기
            this.durability-=eggs.weight;
            eggs.durability-=this.weight;
        }

        void restore(Eggs eggs){            // 복구
            this.durability += eggs.weight;
            eggs.durability +=this.weight;
        }
    }
}
