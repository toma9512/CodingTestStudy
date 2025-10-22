package lv_0_150;

/*
문제 설명
정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.

제한사항
1 ≤ arr의 길이 ≤ 1,000
0 ≤ arr의 원소 ≤ 1,000,000
1 ≤ queries의 길이 ≤ 1,000
0 ≤ s ≤ e < arr의 길이
0 ≤ k ≤ 1,000,000
 */

public class Ex126 {
    public int[] solution(int[] arr, int[][] queries) {
        // 데이터 담기
        int[] answer = new int[queries.length];

        // queries 돌기
        for (int index=0; index<queries.length; index++) {
            // 초기화
            int s = queries[index][0];
            int e = queries[index][1];
            int k = queries[index][2];
            int num = 1000001;

            // query 돌기
            for (int i=s; i<=e; i++) {
                if (arr[i] > k) {
                    num = (num < arr[i]) ? num : arr[i];
                }
            }

            // 저장
            answer[index] = (num == 1000001) ? -1 : num;
        }

        // 리턴
        return answer;
    }
}
