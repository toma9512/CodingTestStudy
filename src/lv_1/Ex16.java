package lv_1;

/*
문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
 */

import java.util.*;

public class Ex16 {
    public int[] solution(int[] arr, int divisor) {
        // 데이터 준비
        List<Integer> list = new ArrayList<>();

        // 데이터 담기
        for (int num : arr) {
            if (num%divisor == 0) list.add(num);
        }

        // 배열로 변환
        Integer[] answer = list.toArray(new Integer[0]);

        // 정렬
        Arrays.sort(answer);

        // 리턴
        if (answer.length == 0) return new int[] {-1};
        return Arrays.stream(answer)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
