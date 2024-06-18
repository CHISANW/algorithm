package programmers.Level_1;

import java.util.*;

public class 개인정보수집유효기간 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms  = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}; //result -> [1, 3]

        System.out.println(Arrays.toString(solution(today,terms,privacies)));
    }
    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(String term : terms){
            String[] split = term.split(" ");
            map.put(split[0], Integer.parseInt(split[1]));
        }

        for(int i =0; i< privacies.length;i++){
            String[] type = privacies[i].split(" ");
            int select = map.get(type[1]);      //약관 타입
            String[] date = type[0].split("\\.");

            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);

            month += select;
            if(day == 1){
                day = 28;
                month -= 1;
            }else{
                day -= 1;
            }

            while(month > 12){
                month -= 12;
                year +=1;
            }

            String[] todays = today.split("\\.");

            int to_year = Integer.parseInt(todays[0]);
            int to_month = Integer.parseInt(todays[1]);
            int to_day = Integer.parseInt(todays[2]);

            if (year < to_year ||
                    (year == to_year && month < to_month) ||
                    (year == to_year && month == to_month && day < to_day)) {
                list.add(i + 1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
