package lv_1;

/*
문제 설명
머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ babbling의 길이 ≤ 100
1 ≤ babbling[i]의 길이 ≤ 30
문자열은 알파벳 소문자로만 이루어져 있습니다.
 */

public class Ex59 {
    public int solution(String[] babbling) {
        // 데이터 준비
        int answer = 0;

        // 다른문자로 대체
        for (int i=0; i<babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "A")
                    .replace("ye", "B")
                    .replace("woo", "C")
                    .replace("ma", "D");
        }

        // 확인
        for (String bab : babbling) {
            // 데이터 초기화
            boolean check = true;
            char[] ch = bab.toCharArray();

            // 전부 대문자인지 확인
            if (ch[0] > 'D') check = false; // 첫글자만 확인
            else {
                for (int i=1; i<ch.length; i++) {
                    if (ch[i]>'D' || ch[i]==ch[i-1]) {
                        check = false;
                        break;
                    }
                }
            }

            if (check) answer++;
        }

        // 리턴
        return answer;
    }
}
