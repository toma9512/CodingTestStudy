package lv_0_200;

/*
문제 설명
문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

제한사항
0 < s의 길이 < 1,000
s는 소문자로만 이루어져 있습니다.
 */

import java.util.*;

public class Ex189 {
    public String solution(String s) {
        // 데이터 준비
        String result = "";
        boolean check = true;

        // s의 길이가 1이면 바로 리턴
        if (s.length() == 1) return s;

        // 정렬 후 재할당
        String[] arr = s.split("");
        Arrays.sort(arr);
        s = String.join("",arr);
        System.out.println(s);

        // 중복 확인
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) check = false;
            else if (check) result += s.charAt(i);
            else check = true;
        }
        if (s.charAt(s.length()-2) != s.charAt(s.length()-1))
            result += s.charAt(s.length()-1);

        // 리턴
        return result;
    }
}
