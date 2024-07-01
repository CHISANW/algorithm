package programmers.level_2;

import java.util.*;

public class 주차요금계산 {
    public static void main(String[] args) {
        int[] fees ={180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(Arrays.toString(solution(fees,records)));        //result -> [14600, 34400, 5000]

        int[] fees1 ={120, 0, 60, 591};
        String[] records1 = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
        System.out.println(Arrays.toString(solution(fees1,records1)));        //result ->  [0, 591]

        int[] fees2 ={1, 461, 1, 10};
        String[] records2 = {"00:00 1234 IN"};
        System.out.println(Arrays.toString(solution(fees2,records2)));        //result -> [14600, 34400, 5000]
    }
    public static int[] solution(int[] fees, String[] records) {
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> savePay = new HashMap<>();
        Map<String,Integer> result = new HashMap<>();

        for(String record : records){
            String[] split = record.split(" ");
            String time = split[0];
            String carNumber = split[1];
            String type = split[2];

            String[] times = time.split(":");
            int hour = Integer.parseInt(times[0]);
            int minute = Integer.parseInt(times[1]);

            int timeSet = (hour*60) + minute;

            if(type.equals("IN")){
                map.put(carNumber, map.getOrDefault(carNumber, 0) + timeSet);
            }else{
                int set = map.get(carNumber);
                savePay.put(carNumber, savePay.getOrDefault(carNumber, 0) + (timeSet - set));
                map.remove(carNumber);
            }
        }

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            int diff = (23 * 60) + 59;
            String key = entry.getKey();
            int values = 0;
            if (savePay.containsKey(key)) {
                values = Math.abs(entry.getValue() - diff) + savePay.get(key);
            } else {
                values = Math.abs(entry.getValue() - diff);
            }
            savePay.put(key, values);
            iterator.remove();
        }

        for(Map.Entry<String,Integer> entry : savePay.entrySet()){
            if(entry.getValue() > fees[0]){
                double overTime = (double)(entry.getValue() - fees[0]) / (double)fees[2];
                int roundedHours = (int)Math.ceil(overTime);
                int fee = roundedHours * fees[3] + fees[1];
                result.put(entry.getKey(), fee);
            } else {
                result.put(entry.getKey(), fees[1]);
            }
        }

        List<String> list = new ArrayList<>(result.keySet());
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = result.get(list.get(i));
        }

        return answer;
    }
}
