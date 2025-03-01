/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 *
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 *
 * 제한 사항
 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 * s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
 * 입출력 예
 * s	return
 * "a234"	false
 * "1234"	true
 */

function solution(n) {
  let split = n.split("");
  if (n.length !== 4 && n.length !== 6) {
    return false;
  }
  for (let i of split) {
    let s = i.charCodeAt(0);
    if (s >= 65 && s <= 122) return false;
  }
  return true;
}

/*
    개선된 함수 존재시 작성
 */
function improvedSolution(n) {
  if (n.length !== 4 && n.length !== 6) {
    return false;
  }

  for (let i = 0; i < n.length; i++) {
    if (isNaN(n[i] || n[i] === " ")) return false;
  }
  return true;
}

console.log(solution("a234"));
console.log(solution("1234"));
console.log(improvedSolution());
