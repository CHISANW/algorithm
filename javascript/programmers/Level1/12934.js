/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 *
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 *
 * 제한 사항
 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
 */

function solution(n) {
  let ans = 0;
  let temp = 0;
  let i = 1;

  while (temp < n) {
    temp = i * i;
    if (temp === n) {
      ans = i;
      break;
    }
    i++;
  }

  if (ans === 0) {
    return -1;
  }

  return (ans + 1) * (ans + 1);
}

/*
    개선된 함수 존재시 작성
 */
function improvedSolution(n) {
  const sqrt = Math.sqrt(n);
  return Number.isInteger(sqrt) ? (sqrt + 1) ** 2 : -1;
}

console.log(solution(121));
console.log(solution(3));
console.log(improvedSolution(121));
console.log(improvedSolution(3));
