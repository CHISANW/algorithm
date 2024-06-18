package programmers.Level_1;

public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes)); //result - >4000;
    }

    public static int solution(int[][] sizes) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0;i<sizes.length;i++){
            int max_r = Math.max(sizes[i][0], sizes[i][1]);
            int max_c = Math.min(sizes[i][0], sizes[i][1]);

            max1 = Math.max(max1,max_r);
            max2= Math.max(max2, max_c);
        }

        return max1*max2;
    }
}
