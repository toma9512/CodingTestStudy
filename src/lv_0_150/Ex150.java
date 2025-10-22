package lv_0_150;

/*
문제 설명
문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ strlist 원소의 길이 ≤ 100
strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
 */

public class Ex150 {
    public int[] solution(String[] strlist) {
        // 데이터 준비
        int[] answer = new int[strlist.length];

        // 데이터 담기
        for (int i=0; i<strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        // 리턴
        return answer;
    }
}
