package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class solve_25757 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        char game = st.nextToken().charAt(0);

        Set<String> player =new HashSet<>();

        for(int i =0;i<n;i++){
            player.add(br.readLine().trim());
        }
        int uniqueCount = player.size();
        int needed;
        if (game == 'Y') {
            needed = 1;
        } else if (game == 'F') {
            needed = 2;
        } else if (game == 'O') {
            needed = 3;
        }else{
            needed = 1;
        }

        int result = uniqueCount / needed;
        System.out.println(result);


    }
}
