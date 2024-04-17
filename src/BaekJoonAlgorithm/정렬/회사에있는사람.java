package BaekJoonAlgorithm.정렬;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 회사에있는사람 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        Set<String> set = new TreeSet<>();
        for (int i =0;i<n;i++){
            String name = stdIn.next();
            String access = stdIn.next();

            if (access.equals("enter")){
                set.add(name);
            }else
                set.remove(name);
        }

        String[] arr = set.toArray(new String[set.size()]);

        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}