function solution(n)
{
    let answer = 0;
    let temp = n;

    while (temp!== 0){
        answer += Math.floor(temp%10)
        temp /= 10;
    }

    return answer;
}

console.log(solution(123))
console.log(solution(987))
