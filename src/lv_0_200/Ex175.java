package lv_0_200;

/*
문제 설명
정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array 원소 ≤ 1,000
array에 중복된 숫자는 없습니다.
 */

public class Ex175 {
    public int[] solution(int[] array) {
        // 데이터 준비
        int[] answer = new int[2];

        // 가장 큰 값 찾기
        for (int i=0; i<array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        // 리턴
        return answer;
    }
}
