package programmers.Lever_1;

import java.util.*;

public class 소수만들기 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums)); //result -> 1

        int[] nums1 = {1,2,7,6,4};
        System.out.println(solution(nums1)); //result -> 4
    }

    public static int solution(int[] nums) {
        int count = 0;

        boolean[] isPrime = new boolean[100001];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= 10000; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= 10000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int len = nums.length;
        for(int i = 0; i < len - 2; i++) {
            for(int j = i + 1; j < len - 1; j++) {
                for(int k = j + 1; k < len; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime[sum]) count++;
                }
            }
        }

        return count;
    }
}
