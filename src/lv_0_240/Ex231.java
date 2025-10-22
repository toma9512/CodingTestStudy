package lv_0_240;

/*
문제 설명
선빈이는 게임을 즐기던 중 가지고 있는 물건이 너무 많아 창고 정리를 하기로 했습니다. 선빈이가 보유한 게임 속 창고는 여러 칸으로 나누어져 있고 각 칸에는 물건들이 담겨있습니다. 창고를 정리할 방법을 고민하던 선빈이는 같은 물건이 여러 칸에 나누어 들어있는 것을 발견하고 우선 같은 물건끼리 최대한 겹쳐쌓는 방식으로 창고를 정리하기로 했습니다. 선빈이의 창고에 들어있는 물건의 이름과 개수는 리스트 형태로 주어지며, 한 칸에 겹쳐질 수 있는 물건의 개수에는 제한이 없다고 가정합니다.
예를 들어 창고의 각 칸에 담겨있는 물건의 이름이storage = ["pencil", "pencil", "pencil", "book"], 각 물건의 개수가 num = [2, 4, 3, 1]이라면 연필과 책을 한 칸에 각각 겹쳐 쌓아 간단하게 clean_storage = ["pencil", "book"], clean_num = [9, 1]로 만들 수 있습니다.
pencil book javacpp.jpg
주어진 solution 함수는 정리되기 전 창고의 물건 이름이 담긴 문자열 리스트 storage와 각 물건의 개수가 담긴 정수 리스트 num이 주어질 때, 정리된 창고에서 개수가 가장 많은 물건의 이름을 return 하는 함수입니다. solution 함수가 올바르게 작동하도록 한 줄을 수정해 주세요.

제한사항
1 ≤ storage의 길이 = num의 길이 ≤ 30
storage[i]는 영어 대소문자로 이루어져 있습니다.
물건은 대소문자를 구분합니다. 즉, "Book"과 "book"은 서로 다른 물건입니다.
1 ≤ storage[i]의 길이 ≤ 30
1 ≤ num[i] ≤ 20
num[i]에는 storage[i]에 해당하는 물건의 개수가 담겨있습니다.
가장 개수가 많은 물건이 두 가지 이상인 경우는 없습니다.
한 칸에는 한 종류의 물건만 들어갈 수 있습니다.
 */

public class Ex231 {
    public String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for(int i=0; i<storage.length; i++){
            int clean_idx = -1;
            for(int j=0; j<num_item; j++){
                if(storage[i].equals(clean_storage[j])){
                    clean_idx = j;
                    break;
                }
            }
            if(clean_idx == -1){
                clean_storage[num_item] = storage[i]; // 수정
                clean_num[num_item] = num[i];
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}
