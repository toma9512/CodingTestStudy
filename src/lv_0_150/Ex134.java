package lv_0_150;

/*
문제 설명
정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

제한사항
1 ≤ l ≤ r ≤ 1,000,000
 */

import java.util.*;

public class Ex134 {
    public int[] solution(int l, int r) {
        // 데이터 준비
        List<Integer> answer = new ArrayList<>();

        // 담기
        for (int i=l; i<=r; i++) {
            String temp = String.valueOf(i);
            boolean isTarget = true;
            for (int j=0; j<temp.length(); j++) {
                if (temp.charAt(j)!='5' && temp.charAt(j)!='0') {
                    isTarget=false;
                    break;
                }
            }
            if (isTarget) answer.add(i);
        }

        // 배열로 변경
        Integer[] arr = answer.toArray(new Integer[answer.size()]);

        // 리턴
        if (arr.length == 0) return new int[] {-1};
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
