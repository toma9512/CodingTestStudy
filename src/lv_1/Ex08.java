package lv_1;

/*
문제 설명
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

제한 사항
n은 0 이상 3000이하인 정수입니다.
 */

public class Ex08 {
    public int solution(int n) {
        // 데이터 준비
        int answer = 0;

        // 약수 구해서 더하기
        for (int i=1; i<=n; i++) {
            if (n%i == 0) answer += i;
        }

        // 리턴
        return answer;
    }
}
