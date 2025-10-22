package lv_1;

/*
문제 설명
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.
 */

public class Ex34 {
    public int solution(int n) {
        // 데이터 준비
        String three = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(three);

        // 뒤집기
        sb = sb.reverse();

        // 문자열
        String answer = sb.toString();

        // 리턴
        return Integer.parseInt(answer, 3);
    }
}
