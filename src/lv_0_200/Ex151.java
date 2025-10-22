package lv_0_200;

/*
문제 설명
정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
1 ≤ numlist의 크기 ≤ 100
1 ≤ numlist의 원소 ≤ 100,000
 */

import java.util.*;

public class Ex151 {
    public int[] solution(int n, int[] numlist) {
        // 데이터 준비
        List<Integer> list = new ArrayList<>();

        // n의 배수인지 확인
        for (int i : numlist) {
            if (i%n == 0) list.add(i);
        }

        // 배열로 변환
        Integer[] answer = list.toArray(new Integer[list.size()]);

        // 리턴
        return Arrays.stream(answer)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
