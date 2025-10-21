package lv_0_100;

/*
- 배열 만들기 1

문제 설명
정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ n ≤ 1,000,000
1 ≤ k ≤ min(1,000, n)
 */

public class Ex085 {
    public int[] solution(int n, int k) {
        // 데이터 준비
        int[] arr = new int[n/k];

        // 데이터 담기
        for (int i=1; i<=n/k; i++) arr[i-1] = k*i;

        // 리턴
        return arr;
    }
}
