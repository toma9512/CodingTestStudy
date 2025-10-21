package lv_0_100;

/*
- 0 떼기

문제 설명
정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ n_str ≤ 10
n_str이 "0"으로만 이루어진 경우는 없습니다.
 */

public class Ex052 {
    public String solution(String n_str) {
        // 데이터 준비
        boolean check = false;
        String answer = "";

        // 앞 부분 0을 제외하고 0이 아닌 수가 나올 시 뒷 부분을 answer에 담기
        for (char i : n_str.toCharArray()) {
            if (i != '0') {
                answer += i;
                check = true;
            } else if (check) {
                answer += i;
            }
        }

        // 리턴
        return answer;
    }
}
