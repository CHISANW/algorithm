package programmers.트리;
import java.util.*;

public class 다단계칫솔판매 {
    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller ={"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        System.out.println(Arrays.toString(solution(enroll,referral,seller,amount)));
    }

    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

        Map<String,String> people = new HashMap<>();
        for(int i =0;i<enroll.length;i++){
            people.put(enroll[i],referral[i]);
        }

        Map<String,Integer> count = new HashMap<>();

        for(int i =0;i<seller.length;i++){
            String sell = seller[i];

            int money = amount[i]*100;

            while(money>0 && !sell.equals("-")){        //반복
                count.put(sell,count.getOrDefault(sell,0)+money - (money/10));
                sell = people.get(sell);
                money /= 10;
            }
        }

        int[] ans = new int[enroll.length];

        for(int i =0;i<enroll.length;i++){
            ans[i] = count.getOrDefault(enroll[i],0);
        }

        return ans;
    }
}
