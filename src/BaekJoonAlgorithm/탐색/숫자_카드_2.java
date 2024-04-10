package BaekJoonAlgorithm.탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제번호 10816번 숫자 카드 2
 * 이진탐색을 통한 문제풀이
 */
public class 숫자_카드_2  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] cards = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            int count = binarySearch(cards, num);
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int firstIndex = -1;
        int lastIndex = -1;

        // 첫 번째 등장 인덱스 찾기
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                if (arr[mid] == target) firstIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // 마지막 등장 인덱스 찾기
        left = 0;
        right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                if (arr[mid] == target) lastIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 등장 횟수 반환
        if (firstIndex != -1 && lastIndex != -1) {
            return lastIndex - firstIndex + 1;
        } else {
            return 0;
        }
    }

}

