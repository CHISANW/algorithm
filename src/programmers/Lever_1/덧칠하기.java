package programmers.Lever_1;

public class 덧칠하기 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2,3,6};
        System.out.println(solution(n,m,section));      //result -> 2
    }

    public static int solution(int n, int m, int[] section){
        int start = section[0];
        int end = section[0] + (m-1);
        int ans = 1;

        for(int i : section){
            if(i>=start && i<=end) continue;
            else{
                start = i;
                end = i+ (m-1);
                ans++;
            }
        }

        return ans;
    }
}
