/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 *
 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 */

function solution(n) {
  return parseInt(n.toString(3).split("").reverse().join(""), 3);
}

/*
    개선된 함수 존재시 작성
 */
function improvedSolution(n) {}

console.log(solution(45));
console.log(solution(125));
console.log(improvedSolution());
