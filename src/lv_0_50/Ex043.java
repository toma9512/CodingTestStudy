package lv_0_50;

import java.io.*;
import java.util.StringTokenizer;

/*
- 덧셈식 출력하기

문제 설명
두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
a + b = c

제한사항
1 ≤ a, b ≤ 100
 */

public class Ex043 {
    public static void main(String[] args) throws IOException {
        // 데이터 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 출력
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}
