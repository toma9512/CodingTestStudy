package lv_0_50;

/*
- 마지막 두 원소

문제 설명
정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 10
1 ≤ num_list의 원소 ≤ 9
 */

public class Ex040 {
    public int[] solution(int[] num_list) {
        // 데이터 준비
        int n = num_list.length;
        int[] answer = new int[n+1];

        // answer에 num_list의 n-1번째 원소까지 담기
        for (int i=0; i<n; i++) {
            answer[i] = num_list[i];
        }

        // answer의 n번째 원소 담기
        if (num_list[n-1] > num_list[n-2]) {
            answer[n] = num_list[n-1] - num_list[n-2];
        } else {
            answer[n] = num_list[n-1] * 2;
        }

        // 리턴
        return answer;
    }
}
