package lv_0_200;

/*
문제 설명
머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array의 원소 ≤ 100,000

 */

public class Ex191 {
    public int solution(int[] array) {
        // 데이터 준비
        int answer = 0;

        // 7이 몇개 있는지 확인
        for (int num : array) {
            String temp = String.valueOf(num);
            for (int i=0; i<temp.length(); i++) {
                if (temp.charAt(i) == '7') answer++;
            }
        }

        // 리턴
        return answer;
    }
}
