package BaekJoonAlgorithm.구현;

import java.util.*;

public class 경비원 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        List<Integer> shops = new ArrayList<>();

        int totalLength = (w+h)*2;
        int shopCount = sc.nextInt();

        for (int i =0; i<shopCount+1;i++){
            int a = sc.nextInt();
            int b =sc.nextInt();
            
            //북쪽
            if(a==1){
                shops.add(b);
            }else if (a==2){    //남쪽
                shops.add(w+h+(w-b));
            }else if(a== 3){    //서쪽
                shops.add((w*2)+h+(h-b));
            }else if(a==4){  //동쪽
                shops.add(w+b);
            }
        }

        int my = shops.get(shops.size()-1);
        int ans = 0;
        for (Integer value : shops){
            int temp = Math.abs(my - value);
            ans += Math.min(temp, totalLength-temp);
        }
        System.out.println(ans);



    }
}