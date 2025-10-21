package lv_0_50;

/*
- n번째 원소

문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ num_list의 길이
 */

public class Ex032 {
    public int[] solution(int[] num_list, int n) {
        // 데이터 준비
        int[] answer = new int[n];

        // 데이터 담기
        for (int i=0; i<n; i++) {
            answer[i] = num_list[i];
        }

        // 리턴
        return answer;
    }
}
