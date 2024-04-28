package BaekJoonAlgorithm.테스트;

import java.util.Arrays;
import java.util.Scanner;

public class 세용액 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = stdIn.nextInt();
        }

        Arrays.sort(arr);           // 이진탐색을 사용하기 위한 정렬

        int ans1 = arr[0];
        int ans2 = arr[1];
        int ans3 = arr[2];
        long ansAbs = Math.abs((long)arr[0] + arr[1] + arr[2]);         // 최초 정답을 arr[0] + arr[1] + arr[2] 로 초기화

        for (int i = 0; i < N-2; i++) {             // i부터 시작하는데 3개의 용액의 대해서 더하기때문에 i는 N-2전까지만 돌아야함
            for (int j=i+1;j<N-1;j++){              // j는 i의+1한 위치부터시작하며 N-1전까지해야 세번째 용액을 더할수 있음
                int pairValue = findValueOp(arr,j+1,N-1,arr[i]+arr[j]);     //3 번째 포인트 값의 느낌으로 j+1값과 N-1까지의 배열에서 arr[1] +arr[2]의 값일 줘서 3번째 값을 구해온다.
                long abs = Math.abs((long)arr[i] + arr[j] + pairValue);                 // 세용액의 합이 0과 가까운 값을 구하는거니 Math.abs를 통해 절대값을 구환다.
                if (abs<ansAbs){        //구한 abs의 값이 정답 abs보다 작다는것은 현재 i=1일때 제일 작을수있다. 그레서 정답을 모두 초기화 해준다.
                    ans1=arr[i];
                    ans2=arr[j];
                    ans3=pairValue;
                    ansAbs=abs;     //i+1번재에도 더작은 값이 있을수 있기 때문에 정답의 abs값을 작았던 abs값으로 초기화
                }
            }
        }

        System.out.println(ans1 + " " + ans2 + " " + ans3);         //출력
    }

    //3번째 용액의 값을 찾는 메서드
    private static int  findValueOp(int[] arr, int fromIndex, int toIndex, int  nowValue) {
        long  optimalPairAbs  = 3000000000L;        //  초기 abs값
        int  optimalPairValue  = 0;                 // 3번째 용액의 값
        int l =fromIndex, r=toIndex;            // 이분탐색을 위한 l , r
        while (l<=r){
            int m = (l+r) / 2;
            long sum = nowValue+arr[m];             // arr[i] +arr[j] 의 값과 현재 이분탐색의 m의 값을 통해서 합을 구하고
            long sumAbs = Math.abs(sum);            // 합의 대한 절대값을 구한다.

            if (sumAbs<optimalPairAbs ){            // 합의 절대값이 정답의 절댓 값보다 작을때 
                optimalPairValue =arr[m];           // 정답의 답을 현재 이분탐색의 값으로 변경하며
                optimalPairAbs  = sumAbs;           // 다음 더 작은 값이 있을수 있기 떄문에 정답 abs를 현재 더한 abs로 초기화
            }

            if (sum<0) l = m+1;                      // 더한 값이 0보다 작다면  값이 더 커야 하기때문에 l의 값을 m+1로 변경
            else if (sum>0) r = m-1;                // sum 값이 크다는것은 r의 값을 m-1의 위치로 변경해야함
            else return arr[m];                     // 더한 값이 0이라는거기때문에 더이상 볼필요가 없어서 현재 값을 반환
        }

        return optimalPairValue ;                   // while을 통과후에 초기화된 Value의 값을 반환
    }
}
