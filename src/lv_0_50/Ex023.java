package lv_0_50;

/*
- 홀짝에 따라 다른 값 반환하기

문제 설명
양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ n ≤ 100
 */

public class Ex023 {
    public int solution(int n) {
        // 데이터 준비
        int sum = 0;

        // 홀수, 짝수에 따라 다른 합
        if (n % 2 == 0) {
            for (int i=2; i<=n; i+=2) {
                sum += Math.pow(i,2);
            }
        } else {
            for (int i=1; i<=n; i+=2) {
                sum += i;
            }
        }

        // 리턴
        return sum;
    }
}
