package lv_0_150;

/*
문제 설명
영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 20
str은 알파벳으로 이루어진 문자열입니다.
 */

import java.util.*;

public class Ex133 {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        // 데이터 준비
        String answer = "";

        // 데이터 담기
        for (int i=0; i<a.length(); i++) {
            // 대소문자 바꿀 단어
            char alpha = a.charAt(i);

            // 소문자, 대문자일 때
            if (alpha>='a' && alpha<='z') {
                answer += (char) (alpha - 32);
            } else {
                answer += (char) (alpha + 32);
            }
        }

        // 출력
        System.out.println(answer);
    }
}
