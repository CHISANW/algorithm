function solution(nums) {
    const set = new Set();
    const length = nums.length;

    nums.forEach(value => {
        set.add(value);
    })
    return Math.floor(length / 2) < set.size ? Math.floor(length / 2) : set.size;
}

console.log(solution([3,1,2,3]))
