package lv_0_200;

/*
문제 설명
문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

제한사항
1 < my_string의 길이 < 100
0 ≤ num1, num2 < my_string의 길이
my_string은 소문자로 이루어져 있습니다.
num1 ≠ num2
 */

public class Ex173 {
    public String solution(String my_string, int num1, int num2) {
        // 데이터 준비
        String answer = "";
        char str1 = my_string.charAt(num1);
        char str2 = my_string.charAt(num2);

        // 데이터 담기
        for (int i=0; i<my_string.length(); i++) {
            if (num1 == i) answer += str2;
            else if (num2 == i) answer += str1;
            else answer += my_string.charAt(i);
        }

        // 리턴
        return answer;
    }
}
