package lv_0_100;

/*
- 세로 읽기

문제 설명
문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string은 영소문자로 이루어져 있습니다.
1 ≤ m ≤ my_string의 길이 ≤ 1,000
m은 my_string 길이의 약수로만 주어집니다.
1 ≤ c ≤ m
 */

public class Ex092 {
    public String solution(String my_string, int m, int c) {
        // 데이터 준비
        String answer = "";

        // 데이터 담기
        for (int i=c-1; i<my_string.length(); i+=m) {
            answer += my_string.charAt(i);
        }

        // 리턴
        return answer;
    }
}
