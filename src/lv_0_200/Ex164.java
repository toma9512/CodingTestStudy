package lv_0_200;

/*
문제 설명
"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.

제한사항
1 ≤ n ≤ 10
 */

import java.util.*;

public class Ex164 {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 출력
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
