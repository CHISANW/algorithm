package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_10709 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());


        StringBuilder sb = new StringBuilder();
        for(int i =0; i<h;i++){
            String line = br.readLine();
            int lastCloudPos = -1;

            for(int j =0; j<w;j++){
                char ch =  line.charAt(j);

                if(ch == 'c'){
                    sb.append("0");
                    lastCloudPos = j;
                }else{
                    if(lastCloudPos == -1){
                        sb.append("-1");
                    }else{
                        sb.append(j - lastCloudPos);
                    }
                }
                if(j <w-1){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
