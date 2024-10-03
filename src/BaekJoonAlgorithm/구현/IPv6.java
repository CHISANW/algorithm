package BaekJoonAlgorithm.구현;

import java.util.*;

public class IPv6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line =sc.next();
        String ans = "";

        if (line.contains("::")){
            String[] parts = line.split("::", -1);
            String[] left = parts[0].isEmpty() ? new String[0] : parts[0].split(":");
            String[] right = parts.length > 1 && !parts[1].isEmpty() ? parts[1].split(":") : new String[0];
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));

            int zeroCount =  8 - (left.length + right.length);
            StringBuilder sb = new StringBuilder();

            for (String part : left) {
                sb.append(String.format("%04x",Integer.parseInt(part,16))).append(":");
            }
            for (int i =0;i<zeroCount;i++){
                sb.append("0000:");
            }

            for (String part : right){
                sb.append(String.format("%04x",Integer.parseInt(part,16))).append(":");
            }
            ans = sb.toString();

        }else{
            String[] parts = line.split(":");
            StringBuilder sb = new StringBuilder();

            for(String part : parts){
                sb.append(String.format("%04x",Integer.parseInt(part,16))).append(":");
            }

            ans = sb.toString();
        }
        System.out.println(ans.substring(0,ans.length()-1));
    }

}
