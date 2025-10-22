package lv_1;

/*
문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 원소 ≤ 9
numbers의 모든 원소는 서로 다릅니다.
 */

public class Ex15 {
    public int solution(int[] numbers) {
        // 데이터 준비
        int answer = 0;

        // 0부터 9까지 숫자 찾기
        for (int i=1; i<10; i++) {
            // 데이터 초기화
            boolean check = true;

            // i가 numbers에 있는지 확인
            for (int num : numbers) {
                if (num == i) {
                    check = false; // 있다는 표시
                    break;
                }
            }

            // 없다면 더하기
            if (check) answer += i;
        }

        // 리턴
        return answer;
    }
}
