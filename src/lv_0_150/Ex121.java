package lv_0_150;

/*
문제 설명
알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
 */

public class Ex121 {
    public int[] solution(String my_string) {
        // 데이터 담기
        int[] arr = new int[52];

        // 반복문
        for (int i=0; i<my_string.length(); i++) {
            char word = my_string.charAt(i);

            // 대문자
            for (int j=0; j<=26; j++) {
                if (word == j+'A') {
                    arr[j]++;
                    break;
                }
            }

            // 소문자
            for (int j=0; j<=26; j++) {
                if (word == j+'a') {
                    arr[j+26]++;
                    break;
                }
            }
        }

        // 리턴
        return arr;
    }
}
