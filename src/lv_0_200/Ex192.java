package lv_0_200;

/*
문제 설명
외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
중복된 원소는 없습니다.
1 ≤ emergency의 길이 ≤ 10
1 ≤ emergency의 원소 ≤ 100
 */

import java.util.*;

public class Ex192 {
    public int[] solution(int[] emergency) {
        // 데이터 준비
        int[] sorted = Arrays.copyOf(emergency, emergency.length);
        int[] order = new int[emergency.length];

        // 내림차순 정렬
        Arrays.sort(sorted);
        for (int i=0; i<sorted.length/2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[sorted.length-1-i];
            sorted[sorted.length-i-1] = temp;
        }

        // 순서 확인
        for (int i=0; i<emergency.length; i++) {
            for (int j=0; j<sorted.length; j++) {
                if (sorted[j] == emergency[i]) {
                    order[i] = j+1;
                    break;
                }
            }
        }

        // 리턴
        return order;
    }
}
