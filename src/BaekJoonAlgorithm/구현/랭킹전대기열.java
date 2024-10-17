package BaekJoonAlgorithm.구현;

import java.util.Map;
import java.util.*;

public class 랭킹전대기열 {
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();   // 플레이어의 수
        m = sc.nextInt();   // 방의 정원

        Map<Room,List<User>> roomMap = new LinkedHashMap<>();
        int firstLevel = sc.nextInt();
        String firstNickname = sc.next();

        roomMap.put(new Room(firstLevel - 10, firstLevel + 10), new ArrayList<>(List.of(new User(firstLevel, firstNickname))));

        for (int i =1; i<p;i++){
            int level = sc.nextInt();
            String nickname = sc.next();

            boolean added = false;

            for (Map.Entry<Room, List<User>> entry : roomMap.entrySet()) {
                Room room = entry.getKey();
                List<User> users = entry.getValue();

                if (room.minLevel <= level && room.maxLevel >= level) {
                    if (users.size() < m) {
                        users.add(new User(level, nickname));
                        added = true;
                        break;
                    }
                }
            }

            if (!added){
                Room newRoom = new Room(level - 10, level + 10);
                roomMap.put(newRoom, new ArrayList<>(List.of(new User(level, nickname))));
            }
        }

        for (Map.Entry<Room, List<User>> entry : roomMap.entrySet()) {
            List<User> users = entry.getValue();

            users.sort(Comparator.comparing(user -> user.nickname));


            if (users.size() == m) {
                System.out.println("Started!");
            } else {
                System.out.println("Waiting!");
            }

            for (User user : users) {
                System.out.println(user.level+" "+user.nickname);
            }

        }
    }

    static class Room{
        int minLevel;
        int maxLevel;
        int size;

        public Room(int minLevel, int maxLevel) {
            this.minLevel = minLevel;
            this.maxLevel = maxLevel;
            this.size =m;
        }
    }

    static class User{
        int level;
        String nickname;

        public User(int id, String nickname) {
            this.level = id;
            this.nickname = nickname;
        }
    }
}
