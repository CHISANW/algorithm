package BaekJoonAlgorithm.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String value;

        while ((value = br.readLine()) != null && !value.isEmpty()) {
            int n = Integer.parseInt(value);

            int length = 1;
            int number =1;

            while (number%n!=0){
                number = number *10 +1;
                number %= n;
                length++;
            }

            System.out.println(length);
        }
    }
}
