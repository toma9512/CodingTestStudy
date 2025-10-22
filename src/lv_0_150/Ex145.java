package lv_0_150;

/*
문제 설명
정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
2 ≤ numbers의 길이 ≤ 30
0 ≤ numbers의 원소 ≤ 1,000
0 ≤num1 < num2 < numbers의 길이
 */

public class Ex145 {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 데이터 준비
        int[] answer = new int[num2-num1+1];

        // 데이터 담기
        for (int i=0; i<answer.length; i++) {
            answer[i] = numbers[num1+i];
        }

        // 리턴
        return answer;
    }
}
