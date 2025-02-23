/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 *
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 1 이상, 10000 이하인 정수입니다.
 */

function solution(n) {
  let tmep = n;
  let value = 0;
  while (tmep !== 0) {
    value += tmep % 10;
    tmep = Math.floor(tmep / 10);
  }
  return n % value === 0;
}

/*
    개선된 함수 존재시 작성
 */
function improvedSolution(n) {
  const sum = String(n)
    .split("")
    .map(Number)
    .reduce((acc, num) => acc + num, 0);

  return n % sum === 0;
}

console.log(solution(10));
console.log(solution(12));
console.log(solution(11));
console.log(solution(13));
console.log(improvedSolution(10));
console.log(improvedSolution(12));
console.log(improvedSolution(11));
console.log(improvedSolution(13));
