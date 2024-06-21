package programmers.level_2;

public class N개의최소공배수 {
    public static void main(String[] args) {
        int[] arr = {2,6,8,1,14};
        System.out.println(solution(arr)); //result -> 168

        int[] arr1 = {1,2,3};
        System.out.println(solution(arr1)); //result -> 6
    }
    public static int solution(int[] arr) {
        int answer = 0;

        for(int i = 1; ;i++){
            int count = 0;
            for(int j =0;j<arr.length;j++){
                if(i%arr[j]==0){
                    count++;
                }
            }

            if(count == arr.length){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
