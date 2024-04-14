package BaekJoonAlgorithm.브루트포스;

import java.io.*;

public class 유레카이론 {

    static boolean[] isEurekaNumber = new boolean[1001];

    //시간 복잡도를 위해서 최초 1회 삼걱형을 모두 구해놈
    public static void preprocess(){
        int[] triangleNumbers =  new int[50];

        int triangleAngleCount = 0;

        // 삼각형을 모두 구함
        for (int i =1; ;i++){
            int triangleNumber = i * (i+1)/2;
            if (triangleNumber>=1000) break;
            triangleNumbers[triangleAngleCount++] = triangleNumber;
        }


        boolean[] isSumOfTriangleNumber = new boolean[1000];
        //두개의 삼격형의 합에 대해서 먼저 계산
        for (int i =0;i<triangleAngleCount;i++){
            for (int j=0;j<triangleAngleCount;j++){
                int sum = triangleNumbers[i]+triangleNumbers[j];
                if (sum<1000) isSumOfTriangleNumber[sum] = true;
            }
        }

        // 먼저 두개의 삼격합 합과 나머지 하나의 삼격형 하나로 나머지 합을 계산
        for (int i =0;i<1000;i++){
            if (!isSumOfTriangleNumber[i]) continue;
            for (int j =0; j<triangleAngleCount; j++){
                int sum = i + triangleNumbers[j];
                if (sum<=1000) isEurekaNumber[sum] =true;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        preprocess();

        while (T-- > 0){
            int k = Integer.parseInt(br.readLine());
            System.out.println(isEurekaNumber[k] ? "1" : "0");
        }

    }
}
