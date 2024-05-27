package programmers.해쉬;

import java.util.*;
import java.util.stream.*;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));     //result -> 2
        int[] nums1 = {3,3,3,2,2,4};
        System.out.println(solution(nums1));     //result -> 3
        int[] nums2 = {3,3,3,2,2,2};
        System.out.println(solution(nums2));     //result -> 2
    }
    public static int solution(int[] nums) {

        //일반 문법으로
//        Set<Integer> set = new HashSet<>();
//         int count = 0;
//         for(int i = 0; i<nums.length;i++){
//             if(set.size()== nums.length/2){
//                 break;
//             }
//             set.add(nums[i]);
//         }

//         return set.size()+count;
        HashSet<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        int n = nums.length;
        int k = n/2;

        return Math.min(k,set.size());
    }
}
