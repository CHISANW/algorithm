package BaekJoonAlgorithm.탐색.이분탐색;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두용액 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int ansAbs = 2000000000;
        int ans1 = 0;
        int ans2 = 0;

        for (int i =0;i<n-1;i++){
            int opValue = findOpValue(arr, i+1,n-1,arr[i]);
            int sum = Math.abs(arr[i]+opValue);
            if (sum<ansAbs){
                ansAbs = sum;
                ans1 = arr[i];
                ans2 = opValue;
            }
        }

        System.out.println(ans1+" "+ans2);
    }

    private static int findOpValue(int[] arr, int fromIndex, int toIndex, int value) {
        int opFindPairAbs = 2000000000;
        int optimalPairValue = 0;
        int l = fromIndex, r= toIndex;
        while (l<=r){
            int m = (l+r)/ 2;
            int sum= value+arr[m];
            int sumAbs= Math.abs(sum);

            if (sumAbs<opFindPairAbs){
                optimalPairValue = arr[m];
                opFindPairAbs = sumAbs;
            }

            if (sum<0) l = m+1;
            else if(sum>0) r = m-1;
            else return arr[m];
        }

        return optimalPairValue;
    }
}
