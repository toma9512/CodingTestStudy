package lv_0_50;

/*
- 접두사인지 확인하기

문제 설명
어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ my_string의 길이 ≤ 100
1 ≤ is_prefix의 길이 ≤ 100
my_string과 is_prefix는 영소문자로만 이루어져 있습니다.
 */

public class Ex036 {
    public int solution(String my_string, String is_prefix) {
        // 데이터 준비
        String answer = "";

        // 접두사의 길이가 더 길면 0을 리턴
        if (my_string.length() < is_prefix.length()) {
            return 0;
        }

        // 접두사인지 확인
        for (int i=0; i<is_prefix.length(); i++) {
            answer += my_string.charAt(i);
        }

        // 리턴
        return (is_prefix.equals(answer)? 1 : 0);
    }
}
