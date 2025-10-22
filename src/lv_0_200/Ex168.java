package lv_0_200;

/*
문제 설명
문자열 my_string이 매개변수로 주어질 때, my_string안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

제한사항
1 ≤ my_string의 길이 ≤ 100
my_string에는 숫자가 한 개 이상 포함되어 있습니다.
my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다.
 */

import java.util.*;

public class Ex168 {
    public int[] solution(String my_string) {
        // 데이터 준비
        List<Integer> list = new ArrayList<>();

        // 데이터 담기
        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch>='0' && ch<='9') {
                list.add(ch-'0');
            }
        }

        // 배열로 변환
        Integer[] answer = list.toArray(new Integer[list.size()]);

        // 정렬
        Arrays.sort(answer);

        // 리턴
        return Arrays.stream(answer)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
