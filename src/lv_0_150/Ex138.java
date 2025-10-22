package lv_0_150;

/*
문제 설명
1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

제한사항
a, b, c, d는 1 이상 6 이하의 정수입니다.
 */

import java.util.*;

public class Ex138 {
    public int solution(int a, int b, int c, int d) {
        // 데이터 준비
        int[] arr = {a,b,c,d};
        int answer = 0;

        // 정렬
        Arrays.sort(arr);

        // 재할당
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];

        // 점수 구하기
        if (a==b && b==c && c==d) { // 4개
            answer += 1111*a;
        } else if (a==b && b==c) { // 3개
            answer += (10*a+d)*(10*a+d);
        } else if (b==c && c==d) { // 3개
            answer += (10*d+a)*(10*d+a);
        } else if (a==b && c==d) { // 2개, 2개
            answer += (a+c)*(c-a);
        } else if (a==b) { // 2개만
            answer += c*d;
        } else if (b==c) { // 2개만
            answer += a*d;
        } else if (c==d) { // 2개만
            answer += a*b;
        } else answer += a; // 전부 다를 때

        // 리턴
        return answer;
    }
}
