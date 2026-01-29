package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class solve_16113 {
    static List<Signal> signals = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();

        int w = n /5;
        char[][] map = new char[5][w];

        for(int i = 0; i<5; i++){
            String row = line.substring(i * w, (i + 1) * w);
            for(int j = 0; j<w;j++){
                map[i][j] = row.charAt(j);
            }
        }

        initSignals();

        StringBuilder sb = new StringBuilder();
        int col = 0;

        while (col < w){
            if(map[0][col] == '.'){
                col++;
                continue;
            }

            boolean matched = false;

            if(col + 2 < w){
                int[][] block = new int[5][3];
                for(int i =0; i<5; i++){
                    for(int j =0; j<3; j++){
                        block[i][j] = (map[i][col + j] == '#') ? 1 : 0;
                    }
                }

                for (Signal signal : signals) {
                    if (match(signal.signal, block)) {
                        sb.append(signal.value);
                        matched = true;
                        break;
                    }
                }
            }


            if(matched){
                col+=3;
            }else{
                sb.append(1);
                col+=1;
            }
        }

        System.out.println(sb);
    }

    static boolean match(int[][] a, int[][] b ){
        for(int i = 0; i<5; i++){
            for(int j =0; j<3;j++ ){
                if(a[i][j] != b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    static class Signal{
        int[][] signal;
        int value;

        public Signal(int[][] signal, int value) {
            this.signal = signal;
            this.value = value;
        }
    }

    static void initSignals() {
        signals.add(new Signal(new int[][]{
                {1,1,1},
                {1,0,1},
                {1,0,1},
                {1,0,1},
                {1,1,1}
        }, 0));

        signals.add(new Signal(new int[][]{
                {1,1,1},
                {0,0,1},
                {1,1,1},
                {1,0,0},
                {1,1,1}
        }, 2));

        signals.add(new Signal(new int[][]{
                {1,1,1},
                {0,0,1},
                {1,1,1},
                {0,0,1},
                {1,1,1}
        }, 3));

        signals.add(new Signal(new int[][]{
                {1,0,1},
                {1,0,1},
                {1,1,1},
                {0,0,1},
                {0,0,1}
        }, 4));

        signals.add(new Signal(new int[][]{
                {1,1,1},
                {1,0,0},
                {1,1,1},
                {0,0,1},
                {1,1,1}
        }, 5));

        signals.add(new Signal(new int[][]{
                {1,1,1},
                {1,0,0},
                {1,1,1},
                {1,0,1},
                {1,1,1}
        }, 6));

        signals.add(new Signal(new int[][]{
                {1,1,1},
                {0,0,1},
                {0,0,1},
                {0,0,1},
                {0,0,1}
        }, 7));

        signals.add(new Signal(new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1},
                {1,0,1},
                {1,1,1}
        }, 8));

        signals.add(new Signal(new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1},
                {0,0,1},
                {1,1,1}
        }, 9));
    }
}
