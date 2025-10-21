package lv_0_150;

/*
문제 설명
문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ myString ≤ 1000
1 ≤ pat ≤ 10
 */

public class Ex105 {
    public int solution(String myString, String pat) {
        // 데이터 준비
        int count = 0;
        int len = pat.length();

        // 확인
        for (int i=0; i<myString.length()-len+1; i++) {
            if (myString.substring(i,i+len).equals(pat)) count++;
        }

        // 리턴
        return count;
    }
}
