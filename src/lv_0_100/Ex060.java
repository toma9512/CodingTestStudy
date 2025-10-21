package lv_0_100;

import java.util.Arrays;

/*
- 뒤에서 5등까지

문제 설명
정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
6 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 100
 */

public class Ex060 {
    public int[] solution(int[] num_list) {
        // 데이터 준비
        int[] answer = new int[5];

        // 정렬
        Arrays.sort(num_list);

        // 5개 구하기
        for (int i=0; i<5; i++) {
            answer[i] = num_list[i];
        }

        // 리턴
        return answer;
    }
}
