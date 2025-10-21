package lv_0_100;

/*
- 배열 만들기3

문제 설명
정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다. 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 100,000
1 ≤ arr의 원소 < 100
1 ≤ a1 ≤ b1 < arr의 길이
1 ≤ a2 ≤ b2 < arr의 길이
 */

public class Ex076 {
    public int[] solution(int[] arr, int[][] intervals) {
        // 데이터 준비
        int num1 = intervals[0][1] - intervals[0][0] + 1;
        int num2 = intervals[1][1] - intervals[1][0] + 1;
        int[] answer = new int[num1+num2];

        // 데이터 담기
        for (int i=0; i<num1; i++) {
            answer[i] = arr[i+intervals[0][0]];
        }
        for (int i=num1; i<num1+num2; i++) {
            answer[i] = arr[i-num1+intervals[1][0]];
        }

        // 리턴
        return answer;
    }
}
