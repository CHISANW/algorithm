/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 *
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */

function solution(n) {
  let temp = n;
  const answer = [];

  while (temp !== 0) {
    answer.push(temp % 10);
    temp = Math.floor(temp / 10);
  }

  return answer;
}

/*
    개선된 함수 존재시 작성
 */
function grow(n) {
  return String(n).split("").reverse().map(Number);
}

console.log(solution(12345));
console.log(grow(12345));
