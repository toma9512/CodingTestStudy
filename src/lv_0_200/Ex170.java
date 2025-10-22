package lv_0_200;

/*
문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

제한사항
-10,000 ≤ numbers의 원소 ≤ 10,000
2 ≤ numbers 의 길이 ≤ 100
 */

import java.util.*;

public class Ex170 {
    public int solution(int[] numbers) {
        // 정렬
        Arrays.sort(numbers);

        // 리턴
        int n = numbers.length;
        return Math.max(numbers[0]*numbers[1],
                numbers[n-2]*numbers[n-1]);
    }
}
