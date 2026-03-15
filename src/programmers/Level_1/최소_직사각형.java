package programmers.Level_1;

public class 최소_직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        System.out.println(solution(sizes));

    }

    static int solution(int[][] sizes){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i =0 ;i<sizes.length;i++){
            int maxR = Math.max(sizes[i][0],sizes[i][1]);
            int maxC = Math.min(sizes[i][0],sizes[i][1]);

            max1 = Math.max(max1,maxR);
            max2 = Math.max(max2,maxC);
        }
        return max1*max2;
    }
}
