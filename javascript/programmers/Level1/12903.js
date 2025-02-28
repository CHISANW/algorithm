/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 *
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 */

function solution(n) {
  let length = n.length;
  let mid = Math.floor(length / 2);

  return length % 2 === 0 ? n[mid - 1] + n[mid] : n[mid];
}

/*
    개선된 함수 존재시 작성
 */
function improvedSolution(n) {}

console.log(solution("abcde"));
console.log(solution("qwer"));
console.log(improvedSolution("qwer"));
