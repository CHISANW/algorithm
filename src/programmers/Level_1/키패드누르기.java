package programmers.Level_1;

public class 키패드누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers,hand));     //result -> "LRLLLRLLRRL"

        int[] numbers1 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        System.out.println(solution(numbers1,hand2));   //result -> "LRLLRRLLLRR"

    }
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int left = 10;
        int right = 12;

        for(int i =0;i<numbers.length;i++){
            int now_button = numbers[i];
            if(now_button == 0) now_button = 11;
            if(now_button == 1 || now_button == 4 || now_button == 7){
                sb.append("L");
                left = now_button;
            }else if(now_button ==3 || now_button == 6 || now_button == 9){
                sb.append("R");
                right = now_button;
            }else{
                int left_dis = getDistance(left,now_button);
                int right_dis = getDistance(right,now_button);

                if(left_dis == right_dis){
                    if(hand.equals("right")) {
                        right = now_button;
                        sb.append("R");
                    }else {
                        left = now_button;
                        sb.append("L");
                    }
                }else if(left_dis > right_dis){
                    right = now_button;
                    sb.append("R");
                }else{
                    left = now_button;
                    sb.append("L");
                }

            }

        }

        return sb.toString();
    }

    //거리 계산
    static int getDistance(int hands,int clickButton){
        int diff = Math.abs(clickButton-hands);
        return diff/3 + diff%3;
    }
}
