package lv_0_50;

/*
- 원소들의 곱과 합

문제 설명
정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 10
1 ≤ num_list의 원소 ≤ 9
 */

public class Ex029 {
    public int solution(int[] num_list) {
        // 데이터 준비
        int mul = 1;
        int sum = 0;

        // 곱과 합 구하기
        for (int i : num_list) {
            mul *= i;
            sum += i;
        }

        // 리턴
        return (mul > sum*sum ? 0 : 1);
    }
}
