package lv_0_200;

/*
문제 설명
약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100
 */

public class Ex183 {
    public int solution(int n) {
        // 데이터 준비
        int count = 0;

        // 합성수인지 확인
        if (n==1) return 0;
        for (int i=2; i<=n; i++) {
            if (!isPrime(i)) count++;
        }

        // 리턴
        return count;
    }

    public boolean isPrime(int n) { // 소수인지 확인하는 메서드
        boolean check = true; // 소수인지 확인

        if (n == 1) return false;
        if (n == 2) return true;
        else if (n%2 == 0) return false;

        for (int i=3; i<=Math.pow(n,0.5); i++) {
            if (n%i == 0) {
                check = false;
                break;
            }
        }

        return check;
    }
}
