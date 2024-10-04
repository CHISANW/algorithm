package BaekJoonAlgorithm.구현;

import java.io.*;
import java.util.*;

public class 싸이버개강총회 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        st= new StringTokenizer(br.readLine());

        Map<String, boolean[]> attendance = new HashMap<>();

        int startTime = timeToInt(st.nextToken());
        int endTime = timeToInt(st.nextToken());
        int streamTime = timeToInt(st.nextToken());

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] parts = line.split(" ");
            int time = timeToInt(parts[0]);
            String name = parts[1];

            if (time<=startTime){
                attendance.putIfAbsent(name,new boolean[2]);
                attendance.get(name)[0] = true;
            }
            if (endTime<=time && time<=streamTime){
                attendance.putIfAbsent(name,new boolean[2]);
                attendance.get(name)[1]= true;
            }
        }


        int count = 0;
        for (boolean[] check : attendance.values()) {
            if (check[0] && check[1]) {
                count++;
            }
        }

        System.out.println(count);
    }

    static int timeToInt(String time){
        String[] parts = time.split(":");
        int min = Integer.parseInt(parts[0])*60;
        int sec = Integer.parseInt(parts[1]);

        return min+sec;
    }
}
