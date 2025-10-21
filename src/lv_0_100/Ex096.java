package lv_0_100;

/*
- 날짜 비교하기

문제 설명
정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.

제한사항
date1의 길이 = date2의 길이 = 3
0 ≤ year ≤ 10,000
1 ≤ month ≤ 12
day는 month에 따라 가능한 날짜로 주어집니다.
 */

public class Ex096 {
    public int solution(int[] date1, int[] date2) {
        // 날짜가 다를 때
        for (int i=0; i<3; i++) {
            if (date1[i] < date2[i]) return 1;
            else if (date1[i] > date2[i]) return 0;
        }

        // 날짜가 같을 때
        return 0;
    }
}
