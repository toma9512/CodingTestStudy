package lv_1;

/*
문제 설명
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
phone_number는 길이 4 이상, 20이하인 문자열입니다.
 */

public class Ex19 {
    public String solution(String phone_number) {
        // 데이터 준비
        String answer = "";
        int n = phone_number.length();

        // * 채우기
        for (int i=0; i<n-4; i++) {
            answer += "*";
        }

        // 뒷자리 붙이기
        answer += phone_number.substring(n-4,n);

        // 리턴
        return answer;
    }
}
