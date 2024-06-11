package programmers.Lever_1;

public class 옹알이2 {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa"};
        System.out.println(solution(babbling));     //result -> 1

        String[] babbling1 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling1));     //result -> 2
    }

    static int solution(String[] babbling){
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] possible = {"aya", "ye", "woo", "ma"};

        int answer = 0;
        for(int i = 0; i<babbling.length;i++){
            for(int j=0;j<4;j++){
                if(babbling[i].contains(impossible[j])){
                    babbling[i] = babbling[i].replace(impossible[j],"1");
                }
            }

            for(int k = 0; k<4;k++){
                babbling[i] = babbling[i].replace(possible[k]," ");
            }

            String str = babbling[i].replace(" ","");
            if(str.length()==0){
                answer++;
            }
        }
        return answer;
    }
}
