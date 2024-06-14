package programmers.Lever_1;

import java.util.*;

public class 데이터분석 {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        System.out.println(Arrays.deepToString(solution(data,ext,val_ext,sort_by)));
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        Map<String, Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);

        List<int[]> list = new ArrayList<>();

        for(int[] d : data){
            if(d[map.get(ext)] < val_ext){
                list.add(d);
            }
        }

//        list.sort(Comparator.comparing(arr -> arr[map.get(sort_by)]));

        list.sort(((o1, o2) -> Integer.compare(o1[map.get(sort_by)], o2[map.get(sort_by)])));
        return list.toArray(new int[0][]);
    }
}
