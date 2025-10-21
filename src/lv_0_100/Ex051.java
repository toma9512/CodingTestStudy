package lv_0_100;

/*
- 꼬리 문자열

문제 설명
문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열이라고 합니다. 꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다. 예를 들어 문자열 리스트 ["abc", "def", "ghi"]가 있고 문자열 "ef"를 포함한 문자열은 제외하고 꼬리 문자열을 만들면 "abcghi"가 됩니다.
문자열 리스트 str_list와 제외하려는 문자열 ex가 주어질 때, str_list에서 ex를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ str_list의 길이 ≤ 10
1 ≤ str_list의 원소의 길이 ≤ 10
1 ≤ ex의 길이 ≤ 5
 */

public class Ex051 {
    public String solution(String[] str_list, String ex) {
        // 데이터 준비
        String answer = "";

        // ex를 포함한 문자열 삭제하기
        for (String word : str_list) {
            boolean check = true;
            for (int j=0; j<=word.length()-ex.length(); j++) {
                boolean check2 = false;
                for (int k=0; k<ex.length(); k++) {
                    if (word.charAt(j+k) != ex.charAt(k)) {
                        check2 = true;
                        break;
                    }
                }
                // 반복문을 돌면서 check2가 변하지 않았으면 ex를 포함한다는 뜻이므로 answer에 포함시키지 않기
                if (!check2) {
                    check = false;
                    break;
                }
            }
            if (check) answer += word;
        }

        // 리턴
        return answer;
    }
}
