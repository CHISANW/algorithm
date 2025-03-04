/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 *
 * 문제 설명
 * - 정수 배열 numbers가 주어집니다.
 * - numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * numbers의 길이는 2 이상 100 이하입니다.
 * numbers의 모든 수는 0 이상 100 이하입니다.
 */
const set = new Set();

function solution(numbers) {
  backtracking(numbers, 0, 0, 0);
  return [...set].sort((a, b) => a - b);
}

function backtracking(numbers, index, count, sum) {
  if (count === 2) {
    set.add(sum);
    return;
  }

  for (let i = index; i < numbers.length; i++) {
    backtracking(numbers, i + 1, count + 1, sum + numbers[i]);
  }
}

/*
    개선된 함수 존재시 작성
 */
function improvedSolution(n) {}

console.log(solution([2, 1, 3, 4, 1]));
console.log(improvedSolution());
