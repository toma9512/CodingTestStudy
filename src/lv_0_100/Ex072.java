package lv_0_100;

/*
- 간단한 식 계산하기

문제 설명
문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.

제한사항
0 ≤ a, b ≤ 40,000
0을 제외하고 a, b는 0으로 시작하지 않습니다.

 */

import java.util.*;

class Ex072 {
    public int solution(String binomial) {
        // 데이터 준비
        StringTokenizer st = new StringTokenizer(binomial);

        // a, op, b 변수 할당
        int a = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        // 연산 후 리턴
        switch (op) {
            case "+" :
                return a + b;
            case "-" :
                return a - b;
            case "*" :
                return a * b;
        }
        return 0; // op가 세 개에 연산기호에 해당하는 경우가 없으면 오류가 발생하기 때문에 작성
    }
}
