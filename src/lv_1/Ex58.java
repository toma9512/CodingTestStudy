package lv_1;

/*
문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
 */

public class Ex58 {
    public int solution(int n) {
        // 데이터 준비
        int answer = 0;

        // 1과 n사이에 소수가 몇개인지 확인
        for (int i=2; i<=n; i++) {
            if (isPrime(i)) answer++;
        }

        // 리턴
        return answer;
    }

    public boolean isPrime(int n) { // 소수인지 확인
        if (n==1) return false;
        if (n==2) return true;

        for (int i=2; i<=Math.pow(n,0.5); i++) {
            if (n%i == 0) return false;
        }

        return true;
    }
}
