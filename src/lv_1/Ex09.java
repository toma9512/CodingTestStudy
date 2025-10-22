package lv_1;

/*
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
 */

import java.util.*;

public class Ex09 {
    public long solution(long n) {
        // 데이터 준비
        String[] arr = String.valueOf(n).split("");

        // 정렬
        Arrays.sort(arr, Comparator.reverseOrder());

        // 리턴
        return Long.parseLong(String.join("", arr));
    }
}
