package BaekJoonAlgorithm.silver1;

import java.io.*;
import java.util.*;

public class solve_1674 {
    static class Event {
        int time;
        String type;
        double n;

        Event(int time, String type, double n) {
            this.time = time;
            this.type = type;
            this.n = n;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        List<Event> events = new ArrayList<>();

        // 입력 읽기
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            String cmd = st.nextToken();
            int t = Integer.parseInt(st.nextToken());

            if (cmd.equals("Query")) {
                events.add(new Event(t, "Query", 0));
            } else {
                double n = Double.parseDouble(st.nextToken());
                events.add(new Event(t, cmd, n));
            }
        }

        // 시간 기준 정렬
        events.sort(Comparator.comparingInt(e -> e.time));

        List<Event> chocolates = new ArrayList<>();
        List<Event> coffees = new ArrayList<>();
        List<Event> queries = new ArrayList<>();

        for (Event e : events) {
            if (e.type.equals("Chocolate")) chocolates.add(e);
            else if (e.type.equals("Coffee")) coffees.add(e);
            else queries.add(e);
        }

        StringBuilder sb = new StringBuilder();

        for (Event q : queries) {
            int T = q.time;
            double safeDist = 0.0;

            // 초콜릿 효과
            for (Event c : chocolates) {
                if (c.time > T) break;
                double effect = 8.0 * c.n - (T - c.time) / 12.0;
                if (effect > 0) safeDist += effect;
            }

            // 커피 효과
            for (Event c : coffees) {
                if (c.time > T) break;
                double effect = 2.0 * c.n - Math.pow(T - c.time, 2) / 79.0;
                if (effect > 0) safeDist += effect;
            }

            // 최소값은 1.0
            safeDist = Math.max(1.0, safeDist);

            sb.append(T)
                    .append(" ")
                    .append(String.format(Locale.US, "%.1f", safeDist))
                    .append("\n");
        }

        System.out.print(sb.toString());
    }
}
