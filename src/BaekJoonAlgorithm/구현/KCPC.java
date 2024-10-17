package BaekJoonAlgorithm.구현;

import java.util.*;

public class KCPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        while (T-- > 0) {
            int n = sc.nextInt(); // 팀의 수
            int k = sc.nextInt(); // 문제의 수
            int t = sc.nextInt(); // 당신 팀의 ID
            int m = sc.nextInt(); // 로그 엔트리의 수

            int[][] scores = new int[n + 1][k + 1]; // 팀별 문제 최고 점수 기록
            int[] totalScore = new int[n + 1]; // 팀별 총점
            int[] submissionCount = new int[n + 1]; // 팀별 제출 횟수
            int[] lastSubmissionTime = new int[n + 1]; // 팀별 마지막 제출 시간

            for (int i = 1; i <= n; i++) {
                Arrays.fill(scores[i], -1); // 초기화
            }

            for (int time = 1; time <= m; time++) {
                int teamId = sc.nextInt(); // 제출한 팀 ID
                int problemId = sc.nextInt(); // 제출한 문제 번호
                int score = sc.nextInt(); // 제출에서 얻은 점수

                // 제출 횟수 기록
                submissionCount[teamId]++;

                // 최고 점수 갱신
                if (scores[teamId][problemId] < score) {
                    totalScore[teamId] += score - Math.max(0, scores[teamId][problemId]);
                    scores[teamId][problemId] = score;
                }

                // 마지막 제출 시간 갱신
                lastSubmissionTime[teamId] = time;
            }

            // 팀별 정보를 리스트로 저장
            List<Team> teams = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                teams.add(new Team(i, totalScore[i], submissionCount[i], lastSubmissionTime[i]));
            }

            teams.sort((team1, team2) -> {
                if (team1.score != team2.score) {
                    return team2.score - team1.score; // 점수가 높은 팀이 우선
                }
                if (team1.submissions != team2.submissions) {
                    return team1.submissions - team2.submissions; // 제출 횟수가 적은 팀이 우선
                }
                return team1.lastSubmissionTime - team2.lastSubmissionTime; // 마지막 제출 시간이 빠른 팀이 우선
            });

            // 당신 팀의 순위 찾기
            for (int i = 0; i < teams.size(); i++) {
                if (teams.get(i).id == t) {
                    System.out.println(i + 1); // 순위는 1-based index
                    break;
                }
            }
        }

    }
    static class Team{
        int id; // 팀 ID
        int score; // 팀의 총 점수
        int submissions; // 제출한 횟수
        int lastSubmissionTime; // 마지막 제출 시간

        public Team(int id, int score, int submissions, int lastSubmissionTime) {
            this.id = id;
            this.score = score;
            this.submissions = submissions;
            this.lastSubmissionTime = lastSubmissionTime;
        }
    }
}

