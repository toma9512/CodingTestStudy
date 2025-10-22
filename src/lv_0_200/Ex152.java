package lv_0_200;

/*
문제 설명
머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < money ≤ 1,000,000
 */

public class Ex152 {
    public int[] solution(int money) {
        // 데이터 준비
        int[] answer = new int[2];

        // 데이터 담기
        answer[0] = money/5500;
        answer[1] = money%5500;

        // 리턴
        return answer;
    }
}
