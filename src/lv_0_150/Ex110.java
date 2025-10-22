package lv_0_150;

/*
문제 설명
정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
단, arr에 2가 없는 경우 [-1]을 return 합니다.

제한사항
1 ≤ arr의 길이 ≤ 100,000
1 ≤ arr의 원소 ≤ 10
 */

public class Ex110 {
    public int[] solution(int[] arr) {
        // 데이터 준비
        int startIndex = -1;
        int endIndex = -1;
        int[] answer = {};

        // 시작, 끝 인덱스 찾기
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                startIndex=i;
                break;
            }
        }
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] == 2) {
                endIndex=i;
                break;
            }
        }

        // 2가 없으면 리턴
        if (startIndex == -1) return new int[] {-1};

        // 데이터 담기
        answer = new int[endIndex - startIndex + 1];
        for (int i=0; i<answer.length; i++) {
            answer[i] = arr[i+startIndex];
        }

        // 리턴
        return answer;
    }
}
