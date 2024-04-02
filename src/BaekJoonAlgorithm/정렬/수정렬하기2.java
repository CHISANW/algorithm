package BaekJoonAlgorithm.정렬;

import java.io.*;

/**
 * 문제 2751번
 * 시간복잡도의 효울이 좋은 병합 정렬을 통해서 문제해결
 */
public class 수정렬하기2 {
    static int[] buff;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i =1;i<=n;i++){
            arr[i-1] = Integer.parseInt(br.readLine());
        }

        mergeSort(arr,n);

        for (int i : arr) {
            bw.write(i+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    //병합정렬 재귀
    static void _mergeSort(int[] a, int left, int right){
        if(left<right){
            int i;
            int center=(left+right) / 2;
            int p =0;
            int j = 0;
            int k = left;

            _mergeSort(a,left,center);
            _mergeSort(a,center+1,right);

            for (i=left; i<=center;i++)
                buff[p++] = a[i];

            while (i<=right && j<p)
                a[k++] = (buff[j]<= a[i])?buff[j++] : a[i++];

            while (j<p)
                a[k++] = buff[j++];

        }
    }

    //병합정렬
    static void mergeSort(int[] a, int n){
        buff = new int[n];
        _mergeSort(a,0,n-1);
        buff=null;
    }
}
