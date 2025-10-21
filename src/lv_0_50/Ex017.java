package lv_0_50;

/*
- 이어 붙인 수

문제 설명
정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 10
1 ≤ num_list의 원소 ≤ 9
num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.
 */

public class Ex017 {
    public int solution(int[] num_list) {
        // 데이터 준비
        String odd = "";
        String even = "";

        // 짝수, 홀수 합치기
        for (int i : num_list) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        // 리턴
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}
