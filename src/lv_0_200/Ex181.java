package lv_0_200;

/*
문제 설명
정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
3 ≤ numbers의 길이 ≤ 20
direction은 "left" 와 "right" 둘 중 하나입니다.
 */

public class Ex181 {
    public int[] solution(int[] numbers, String direction) {
        if (direction.equals("right")) { // 오른쪽인 경우
            int temp = numbers[numbers.length-1]; // 임시 저장
            for (int i=numbers.length-1; i>0; i--) { // 오른쪽으로 밀기
                numbers[i] = numbers[i-1];
            }
            numbers[0] = temp; // 임시 저장한 것을 0번째 인덱스에 저장
        } else { // 왼쪽인 경우
            int temp = numbers[0]; // 임시 저장
            for (int i=0; i<numbers.length-1; i++) { // 왼쪽으로 밀기
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length-1] = temp; // 임시 저장한 것을 마지막 인덱스에 저장
        }

        // 리턴
        return numbers;
    }
}
