/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 *
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 */

function solution(n) {
  let ans = [];

  while (n !== 0) {
    ans.push(n % 10);
    n = Math.floor(n / 10);
  }

  return Number(ans.sort((a, b) => b - a).join(""));
}

/*
    개선된 함수 존재시 작성
 */
function improvedSolution(n) {
  return Number(
    String(n)
      .split("")
      .sort((a, b) => b - a)
      .join(""),
  );
}

console.log(solution(118372));
console.log(improvedSolution(118372));
