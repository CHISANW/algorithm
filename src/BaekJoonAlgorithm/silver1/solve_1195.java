package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_1195 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine().trim();
        String b = br.readLine().trim();

        System.out.println(Math.min(solve(a,b), solve(b,a)));
    }

    static int solve(String a, String b){

        int al = a.length();
        int bl = b.length();

        int best =al + bl;

        for(int offset = -bl; offset <=al; offset++){
            boolean ok = true;

            for(int i =0; i< bl;i++){
                int ai = i + offset;
                if(ai >=0 && ai<al){
                    if(a.charAt(ai) == '2' && b.charAt(i) == '2'){
                        ok = false;
                        break;
                    }
                }
            }

            if(ok){
                int left = Math.min(0, offset);
                int right = Math.max(al, offset + bl);
                best = Math.min(best, right - left);
            }
        }
        return best;
    }
}
