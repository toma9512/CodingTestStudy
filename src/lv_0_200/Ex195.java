package lv_0_200;

/*
문제 설명
i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
i! ≤ n

제한사항
0 < n ≤ 3,628,800
 */

public class Ex195 {
    public int solution(int n) {
        // 데이터 준비
        int answer = 1;
        int mul = 1;

        // 팩토리얼 구하기
        while (mul <= n) {
            mul *= ++answer;
        }

        // 리턴
        return answer-1;
    }
}
