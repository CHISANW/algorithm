package programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 테이블해시함수 {
    public static void main(String[] args) {
        int[][] data  = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
        System.out.println(solution(data,2,2,3));
    }

    public static int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, (x, y) ->{
            if(x[col-1] == y[col-1])
                return y[0] - x[0];
            return x[col-1] - y[col-1];
        });


        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<data.length;i++){
            int sum = 0;
            boolean check = false;
            for(int j = 0;j<data[i].length;j++){
                if( i>= row_begin-1 && i <= row_end-1){
                    check = true;
                    sum += data[i][j] % (i+1);
                }
            }
            if(check) {
                list.add(sum);
            }
        }

        int result = 0;
        for(int i : list){
            result ^= i;
        }
        return result;
    }
}
