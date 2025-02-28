function solution(n) {

    const dp = [];
    dp[1] = "수";
    dp[2] = "수박";

    for(let i =3; i<=n;i++) {
        if (i % 2 === 0) {
            dp[i] = dp[i - 1] + "박";
        } else {
            dp[i] = dp[i - 1] + "수";
        }
    }

    console.log(dp[n]);
    return "answer";

}

