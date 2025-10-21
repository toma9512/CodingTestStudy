package lv_0_100;

import java.util.*;

/*
- 뒤에서 5등 위로

문제 설명
정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
6 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 100
 */

public class Ex057 {
    public int[] solution(int[] num_list) {
        // 데이터 준비
        int[] answer = new int[num_list.length-5];

        // 정렬
        Arrays.sort(num_list);

        // 데이터 저장
        for (int i=0; i<answer.length; i++) {
            answer[i] = num_list[5+i];
        }

        // 리턴
        return answer;
    }
}
