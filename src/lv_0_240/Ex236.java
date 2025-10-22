package lv_0_240;

/*
문제 설명
첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 <numer1, denom1, numer2, denom2 < 1,000
 */

public class Ex236 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 데이터 준비
        int numer = denom1*numer2 + denom2*numer1; // 분자
        int denom = denom1*denom2; // 분모
        int numGcd = gcd(numer, denom);

        // 리턴
        return new int[] {numer/numGcd, denom/numGcd};
    }

    public int gcd(int n, int m) { // 최대공약수
        int result = 1;
        for (int i=1; i<=Math.min(m,n); i++) {
            if (n%i==0 && m%i==0)
                result = Math.max(i,result);
        }
        return result;
    }
}
