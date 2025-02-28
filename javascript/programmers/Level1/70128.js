/**
 *
 */

function solution(a, b) {
  let answer = 0;
  for (let i = 0; i < a.length; i++) {
    answer += a[i] * b[i];
  }
  return answer;
}

/*
    개선된 함수 존재시 작성
 */
function improvedSolution(a, b) {
  return a.reduce((sum, val, i) => sum + val * b[i], 0);
}

console.log(solution([1, 2, 3, 4], [-3, -1, 0, 2]));
console.log(solution([-1, 0, 1], [1, 0, -1]));
console.log(improvedSolution());
