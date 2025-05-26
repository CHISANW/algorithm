package hackRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Optional<Integer> maxValue = candles.stream().max(Integer::compare);
        maxValue.ifPresent(System.out::println);
        if (maxValue.isPresent()) {
            long count = candles.stream().filter(t -> t.equals(maxValue.get())).count();
            return Math.toIntExact(count);
        } else {
            return 0;
        }

    }

}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("촛불 개수 입력: ");
        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.print("촛불 높이들 입력 (예: 3 2 1 3): ");
        List<Integer> candles = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = Result.birthdayCakeCandles(candles);

        // 결과 콘솔에 출력
        System.out.println("가장 높은 촛불 개수: " + result);

        bufferedReader.close();
    }
}
