package programmers.level_2;

import java.util.*;

public class 파일명정렬 {
    public static void main(String[] args) {
        String[] ex = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        System.out.println(Arrays.toString(solution(ex)));      //result -> ["img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"]

        String[] ex1 = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        System.out.println(Arrays.toString(solution(ex1)));      //result ->  ["A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"]
    }

    public static String[] solution(String[] files) {
        Arrays.sort(files, (file1, file2) -> {
            String[] part1 = splitFile(file1);
            String[] part2 = splitFile(file2);

            String head1 = part1[0].toUpperCase();
            String head2 = part2[0].toUpperCase();

            int headCompare = head1.compareTo(head2);
            if (headCompare != 0) {
                return headCompare;
            }

            int numberCompare = Integer.parseInt(part1[1]) - Integer.parseInt(part2[1]);
            if (numberCompare != 0) {
                return numberCompare;
            }

            return 0;
        });

        return files;
    }

    private static String[] splitFile(String file) {
        String head = "";
        String number = "";
        String tail = "";

        int i = 0;
        while (i < file.length() && !Character.isDigit(file.charAt(i))) {
            head += file.charAt(i);
            i++;
        }
        while (i < file.length() && Character.isDigit(file.charAt(i))) {
            number += file.charAt(i);
            i++;
        }

        if (i < file.length()) {
            tail = file.substring(i);
        }

        return new String[]{head, number, tail};
    }
}
