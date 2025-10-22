package lv_1;

/*
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
 */

public class Ex02 {
    public int[] solution(long n) {
        // 데이터 준비
        String strN = String.valueOf(n);
        int[] answer = new int[strN.length()];

        // 데이터 담기
        for (int i=0; i<answer.length; i++) {
            answer[i] = strN.charAt(strN.length()-i-1) - '0';
        }

        // 리턴
        return answer;
    }
}
