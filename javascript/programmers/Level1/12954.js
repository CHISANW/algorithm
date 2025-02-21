function solution(x, n) {
  return Array.from({ length: n }, (_, i) => x * (i + 1));
}

console.log(solution(2, 5)); // [2, 4, 6, 8, 10]
console.log(solution(-4, 2)); // [2, 4, 6, 8, 10]
