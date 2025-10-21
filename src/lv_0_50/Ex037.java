package lv_0_50;

/*
- 글자 이어 붙여 문자열 만들기

문제 설명
문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string의 원소는 영소문자로 이루어져 있습니다.
1 ≤ index_list의 길이 ≤ 1,000
0 ≤ index_list의 원소 < my_string의 길이

 */

public class Ex037 {
    public String solution(String my_string, int[] index_list) {
        // 데이터 준비
        String answer = "";

        // 데이터 담기
        for (int i : index_list) {
            answer += my_string.charAt(i);
        }

        // 리턴
        return answer;
    }
}
