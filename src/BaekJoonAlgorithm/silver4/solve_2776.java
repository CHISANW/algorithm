package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class solve_2776 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            Set<Integer> note1Set = new HashSet<>();
            int note1 = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String[] s1 = s.split(" ");
            for(int i =0; i <note1;i++){
                note1Set.add(Integer.parseInt(s1[i]));
            }
            int note2 = Integer.parseInt(br.readLine());
            String s2 = br.readLine();
            String[] s3 = s2.split(" ");
            for(int i =0; i <note2;i++){
                if(note1Set.contains(Integer.parseInt(s3[i]))){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
