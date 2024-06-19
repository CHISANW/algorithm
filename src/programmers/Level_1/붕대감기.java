package programmers.Level_1;

public class 붕대감기 {
    public static void main(String[] args) {
        int[] bandage ={5,1,5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        System.out.println(solution(bandage,health,attacks));
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량

        int success = 0; // 연속 성공 시간
        int attackIndex = 0;

        for(int time = 1; time<=attacks[attacks.length-1][0];time++){
            if(attackIndex< attacks.length && time == attacks[attackIndex][0]){
                health -= attacks[attackIndex][1];
                success = 0;
                attackIndex++;
                if(health <= 0) return -1;
            }else{

                health+=x;
                success++;

                if(success == t){
                    health+=y;
                    success = 0;
                }

                if(health>maxHealth){
                    health = maxHealth;
                }
            }

        }
        return health;
    }
}
