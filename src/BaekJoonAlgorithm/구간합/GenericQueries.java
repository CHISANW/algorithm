package BaekJoonAlgorithm.구간합;

import java.util.Scanner;

public class GenericQueries {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int q = stdIn.nextInt();

        int[] arr= new int[n+1];
        for (int i =1;i<=n;i++){
            arr[i] = stdIn.nextInt();
        }

        int[] acc = new int[n+1];
        for (int i =1;i<=n;i++)
            acc[i] = acc[i-1] ^ arr[i];

        int ans= 0;
        while (q-- > 0) {
            int s = stdIn.nextInt();
            int e = stdIn.nextInt();
            ans ^= acc[e] ^ acc[s-1];
        }

        System.out.println(ans);
    }
}
