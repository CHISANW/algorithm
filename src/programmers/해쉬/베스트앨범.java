package programmers.해쉬;

import java.util.*;
import java.util.stream.Stream;

public class 베스트앨범 {

    public static void main(String[] args){

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(Arrays.toString(solution(genres,plays)));    //result -> 4130
    }

    public static int[]  solution(String[] genres, int[] plays) {

        Map<String, ArrayList<int[]>> genresMap = new HashMap<>();
        Map<String,Integer> playMap = new HashMap<>();


        // 데이터 맵에다가 데이터 삽입
        for(int i =0;i<genres.length;i++){
            String genre =genres[i];
            int play = plays[i];
            if(!genresMap.containsKey(genre)){
                genresMap.put(genre,new ArrayList<>());
                playMap.put(genre,0);
            }
            genresMap.get(genre).add(new int[]{i,play});
            playMap.put(genre,playMap.get(genre)+play);
        }

        // 장르순으로 먼저 정렬
        List<Integer> ans = new ArrayList<>();

        Stream<Map.Entry<String, Integer>> sorted = playMap.entrySet().stream().sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));

        sorted.forEach( entry -> {
            Stream<int[]> songs = genresMap.get(entry.getKey()).stream()
                    .sorted((o1, o2) -> Integer.compare(o2[1], o1[1]))
                    .limit(2);

            songs.forEach(song -> ans.add(song[0]));
        });


        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

}
