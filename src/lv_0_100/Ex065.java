package lv_0_100;

/*
- 배열의 원소만큼 추가하기

문제 설명
아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 100
1 ≤ arr의 원소 ≤ 100
 */

public class Ex065 {
    public int[] solution(int[] arr) {
        // 데이터 준비
        int sum = 0;
        for (int i : arr) sum += i;
        int[] answer = new int[sum];
        int idx = 0;

        // 데이터 담기
        for (int i : arr) {
            for (int j=0; j<i; j++) {
                answer[idx++] = i;
            }
        }

        // 리턴
        return answer;
    }
}
