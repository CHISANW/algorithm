package BaekJoonAlgorithm.기하직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 9063번
 */
public class 대지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] max=new int[n];
        int[] min=new int[n];

        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            max[i] = x;
            min[i] =y;
        }

        int xmax=max[0];
        int xmin=max[0];
        int ymax=min[0];
        int ymin=min[0];

        for (int i =1;i<n;i++){
            xmax= Math.max(xmax,max[i]);
            xmin= Math.min(xmin,max[i]);
            ymax= Math.max(ymax,min[i]);
            ymin= Math.min(ymin,min[i]);
        }

        int result = (xmax-xmin) * (ymax-ymin);
        System.out.println(result);

    }
}
