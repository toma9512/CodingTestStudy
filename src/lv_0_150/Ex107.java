package lv_0_150;

/*
문제 설명
정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다. arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 1,000
1 ≤ arr의 원소 ≤ 1,000
 */

public class Ex107 {
    public int[] solution(int[] arr) {
        // 데이터 준비
        int len = 1;
        int[] answer = {};

        // 길이 구하기
        while (len<arr.length) len *= 2;

        // answer에 길이 할당
        answer = new int[len];

        // 복사
        for (int i=0; i<arr.length; i++) answer[i] = arr[i];

        // 리턴
        return answer;
    }
}
