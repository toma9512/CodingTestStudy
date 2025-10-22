package lv_0_200;

/*
문제 설명
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
 */

import java.util.*;

public class Ex174 {
    public int[] solution(int n) {
        // 데이터 준비
        List<Integer> list = new ArrayList<>();

        // 약수 담기
        for (int i=1; i<=n; i++) {
            if (n%i == 0) list.add(i);
        }

        // 배열로 변환
        Integer[] answer = list.toArray(new Integer[list.size()]);

        // 리턴
        return Arrays.stream(answer)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
