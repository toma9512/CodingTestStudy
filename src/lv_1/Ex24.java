package lv_1;

/*
문제 설명
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ left ≤ right ≤ 1,000
 */

public class Ex24 {
    public int solution(int left, int right) {
        // 데이터 준비
        int answer = 0;

        // 데이터 담기
        for (int i=left; i<=right; i++) {
            answer += isSquare(i) ? -i : i;
        }

        // 리턴
        return answer;
    }

    public boolean isSquare(int n) { // 제곱수인지 확인
        int nSquare = (int) Math.pow(n,0.5);
        return n == nSquare*nSquare;
    }
}
