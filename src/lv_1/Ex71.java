package lv_1;

/*
문제 설명
AI 엔지니어인 현식이는 데이터를 분석하는 작업을 진행하고 있습니다. 데이터는 ["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]으로 구성되어 있으며 현식이는 이 데이터들 중 조건을 만족하는 데이터만 뽑아서 정렬하려 합니다.
예를 들어 다음과 같이 데이터가 주어진다면
data = [[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]]
이 데이터는 다음 표처럼 나타낼 수 있습니다.
code	date	maximum	remain
1	20300104	100	80
2	20300804	847	37
3	20300401	10	8
주어진 데이터 중 "제조일이 20300501 이전인 물건들을 현재 수량이 적은 순서"로 정렬해야 한다면 조건에 맞게 가공된 데이터는 다음과 같습니다.
data = [[3,20300401,10,8],[1,20300104,100,80]]
정렬한 데이터들이 담긴 이차원 정수 리스트 data와 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미하는 문자열 ext, 뽑아낼 정보의 기준값을 나타내는 정수 val_ext, 정보를 정렬할 기준이 되는 문자열 sort_by가 주어집니다.
data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여 return 하도록 solution 함수를 완성해 주세요. 단, 조건을 만족하는 데이터는 항상 한 개 이상 존재합니다.

제한사항
1 ≤ data의 길이 ≤ 500
data[i]의 원소는 [코드 번호(code), 제조일(date), 최대 수량(maximum), 현재 수량(remain)] 형태입니다.
1 ≤ 코드 번호≤ 100,000
20000101 ≤ 제조일≤ 29991231
data[i][1]은 yyyymmdd 형태의 값을 가지며, 올바른 날짜만 주어집니다. (yyyy : 연도, mm : 월, dd : 일)
1 ≤ 최대 수량≤ 10,000
1 ≤ 현재 수량≤ 최대 수량
ext와 sort_by의 값은 다음 중 한 가지를 가집니다.
"code", "date", "maximum", "remain"
순서대로 코드 번호, 제조일, 최대 수량, 현재 수량을 의미합니다.
val_ext는 ext에 따라 올바른 범위의 숫자로 주어집니다.
정렬 기준에 해당하는 값이 서로 같은 경우는 없습니다.
 */

import java.util.*;

public class Ex71 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 데이터 준비
        List<int[]> list = new ArrayList<>();
        String[] extArr = {"code", "date", "maximum", "remain"};
        List<String> extList = Arrays.asList(extArr);

        // ext 기준
        int idx1 = extList.indexOf(ext);
        for (int[] dat : data) {
            if (dat[idx1]<val_ext) list.add(dat);
        }

        // sort 기준
        int idx2 = extList.indexOf(sort_by);
        Collections.sort(list, (o1, o2)->o1[idx2] - o2[idx2]);

        // 배열로 변환
        int[][] answer = new int[list.size()][];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        // 리턴
        return answer;
    }
}
