package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열집합 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        String[] arr = new String[n];
        for (int i =0;i<n;i++){
           arr[i] = stdIn.next();
        }

        Arrays.sort(arr);


        int count = 0;
        while (m-- >0){
            String x = stdIn.next();
            if (isExist(arr,x))
                count++;
        }

        System.out.println(count);
    }

    private static boolean isExist(String[] arr, String x) {
        int l = 0;
        int r = arr.length-1;
        while (l<=r){
            int m = (l+r)/2;
            int compareResult = arr[m].compareTo(x);

            if (compareResult<0)  l = m+1;
            else if (compareResult>0) r = m-1;
            else return true;
        }
        return false;
    }
}
