package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class solve_14235 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2- o1);

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a  = Integer.parseInt(st.nextToken());

            if(a ==0){
                if(!pq.isEmpty()){
                    sb.append(pq.poll()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else{
                for(int j =0; j<a;j++){
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
        System.out.println(sb.toString());
    }
}
