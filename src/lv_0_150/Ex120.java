package lv_0_150;

/*
문제 설명
문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다. str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요. "l"이나 "r"이 없다면 빈 리스트를 return합니다.

제한사항
1 ≤ str_list의 길이 ≤ 20
str_list는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
 */

public class Ex120 {
    public String[] solution(String[] str_list) {
        // 데이터 준비
        int index = -1;
        String[] answer = {};
        int isL = 0; // 먼저 나오는 것이 "l"인지 "r"인지 없는지

        // 먼저 나오는 것 확인하고 인덱스 저장
        for (int i=0; i<str_list.length; i++) {
            // "l"인 경우
            if (str_list[i].equals("l")) {
                index = i;
                isL = 1;
                break;
            }

            // "r"인 경우
            if (str_list[i].equals("r")) {
                index = i;
                isL = 2;
                break;
            }
        }

        // 데이터 담기
        if (isL == 1) {
            answer = new String[index];
            for (int i=0; i<index; i++) {
                answer[i] = str_list[i];
            }
        } else if (isL == 2) {
            answer = new String[str_list.length-index-1];
            for (int i=0; i<answer.length; i++) {
                answer[i] = str_list[index+i+1];
            }
        }

        // 리턴
        return answer;
    }
}
