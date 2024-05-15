package programmers.배열;

import java.util.*;

public class 방문길이 {
    public static void main(String[] args){

        String ans1 ="ULURRDLLU";
        System.out.println(solution(ans1));     //result -> 7
        String ans2 ="LULLLLLLU";
        System.out.println(solution(ans2));     //result -> 7

    }

    static Map<Character,int[]> location = new HashMap<>();

    static void initLocation(){
        location.put('U',new int[]{0,1});
        location.put('D',new int[]{0,-1});
        location.put('L',new int[]{-1,0});
        location.put('R',new int[]{1,0});
    }

    static boolean isValid(int x, int y){
        return 0<=x && x<11 && 0<=y && y<11;
    }

    static int solution(String dirs){
        initLocation();

        Set<String> ans = new HashSet<>();
        int x = 5;
        int y = 5;
        for(int i =0;i<dirs.length();i++){
            int[] offset = location.get(dirs.charAt(i));

            int nx = x+offset[0];
            int ny = y+offset[1];
            if(!isValid(nx,ny)) continue;

            ans.add(x+" "+y+" "+" "+nx+" "+ny);
            ans.add(nx+" "+ny+" "+" "+x+" "+y);
            x = nx;
            y = ny;
        }

        return ans.size()/2;
    }
}
