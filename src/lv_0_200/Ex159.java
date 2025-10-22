package lv_0_200;

/*
문제 설명
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

제한사항
0 ≤ n ≤ 1,000,000
 */

public class Ex159 {
    public int solution(int n) {
        // 데이터 준비
        int answer = 0;
        String strN = String.valueOf(n);

        // 더하기
        for (int i=0; i<strN.length(); i++) {
            answer += strN.charAt(i) - '0';
        }

        // 리턴
        return answer;
    }
}
