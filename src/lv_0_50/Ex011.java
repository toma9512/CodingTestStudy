package lv_0_50;

/*
- 짝수의 합

문제 설명
정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

제한사항
0 < n ≤ 1000
 */

public class Ex011 {
    public int solution(int n) {
        int sum = 0;

        for (int i=2; i<n+1; i+=2) {
            sum += i;
        }

        return sum;
    }
}
