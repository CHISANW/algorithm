function solution(arr){
    const length = arr.length;
    let sum = 0;
    for (const i of arr) {
        sum += i;
    }
    return sum / length;
}

console.log(solution([1,2,3,4]));
console.log(solution([5,5]));
