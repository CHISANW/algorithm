package BaekJoonAlgorithm.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 1546 번
 */
public class 평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double[] arr= new double[n];
        double sum=0;
        double result =0;

        double max = arr[0];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       for (int i=0;i<n;i++){
           arr[i] = Integer.parseInt(st.nextToken());
       }
       for (int i=0;i<arr.length;i++){
           if(arr[i]>=max)
               max=arr[i];
        }

       for (int i=0;i<arr.length;i++){
           arr[i]=(arr[i]/max)*100;
       }
       for (int i=0;i<arr.length;i++){
           sum+=arr[i];
       }

       result=sum/n;

        System.out.println(result);
       br.close();
    }
}
