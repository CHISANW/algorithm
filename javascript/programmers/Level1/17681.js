/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681?language=javascript
 *
 * 비밀지도
 * 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
 *
 * 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
 * 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
 * "지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
 * 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
 */

function solution(n, arr1, arr2) {
  let a = [];
  let b = [];
  let answer = [];

  for (let i of arr1) {
    a.push(i.toString(2).padStart(n, "0"));
  }

  for (let i of arr2) {
    b.push(i.toString(2).padStart(n, "0"));
  }

  for (let i = 0; i < a.length; i++) {
    answer[i] = [];
    let split = a[i].split("");
    for (let j = 0; j < split.length; j++) {
      answer[i][j] = split[j] === "0" ? " " : "#";
    }
  }

  for (let i = 0; i < b.length; i++) {
    let split = b[i].split("");
    for (let j = 0; j < split.length; j++) {
      let string = split[j] === "0" ? " " : "#";
      if (string !== " ") {
        answer[i][j] = string;
      }
    }
  }
  let ans = [];

  for (let i = 0; i < answer.length; i++) {
    ans.push(answer[i].join(""));
  }
  return ans;
}

/*
    개선된 함수 존재시 작성
 */
function improvedSolution(n, arr1, arr2) {
  return arr1.map((num1, i) => {
    const combined = (num1 | arr2[i]).toString(2).padStart(n, "0");
    return combined.replace(/1/g, "#").replace(/0/g, " ");
  });
}

console.log(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]));
console.log(improvedSolution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]));
