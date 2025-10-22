package lv_0_240;

/*
문제 설명
정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
1 ≤ numlist의 원소 ≤ 10,000
1 ≤ numlist의 길이 ≤ 100
numlist는 중복된 원소를 갖지 않습니다.
 */

import java.util.*;

public class Ex223 {
    public int[] solution(int[] numlist, int n) {
        // 데이터 준비
        List<Integer> list = new ArrayList<>();

        // 거리가 0일 때
        if (contain(numlist, n)) list.add(n);

        // 거리가 n인 원소들 확인
        for (int dis=1; dis<=n; dis++) {
            if (contain(numlist, n+dis)) list.add(n+dis);
            if (contain(numlist, n-dis)) list.add(n-dis);
        }

        // 거리가 n보다 큰 원소들 확인
        int distance = n+1;
        while (list.size() < numlist.length) {
            if (contain(numlist, n+distance)) list.add(n+distance);
            distance++;
        }

        // 배열로 변환
        Integer[] answer = list.toArray(new Integer[0]);

        // 리턴
        return Arrays.stream(answer)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // 배열에 원소가 있는지 확인하는 메서드
    public boolean contain(int[] numlist, int n) {
        for (int num : numlist) {
            if (n == num) return true;
        }

        return false;
    }
}
