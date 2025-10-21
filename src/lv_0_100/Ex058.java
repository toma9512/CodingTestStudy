package lv_0_100;

/*
- 문자열 정수의 합

문제 설명
한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
3 ≤ num_str ≤ 100
 */

public class Ex058 {
    public int solution(String num_str) {
        // 데이터 준비
        int answer = 0;

        // 합 구하기
        for (char i : num_str.toCharArray()) {
            answer += i - '0';
        }

        // 리턴
        return answer;
    }
}
