package lv_0_100;

/*
- x 사이의 개수

문제 설명
문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ myString의 길이 ≤ 100,000
myString은 알파벳 소문자로 이루어진 문자열입니다.
 */

import java.util.*;

// class Ex066 {
//     public int[] solution(String myString) {
//         // 데이터 준비
//         List<String> arr = new ArrayList<>();
//         String word = "";
//
//         // "x"를 기준으로 나누기
//         for (int i=0; i<myString.length(); i++) {
//             if (myString.charAt(i) != 'x') {
//                 word += myString.charAt(i);
//             } else {
//                 arr.add(word);
//                 word = "";
//             }
//         }
//         arr.add(word); // 마지막 한번 더 원소 더해주기
//
//         // 리턴할 데이터
//         int[] answer = new int[arr.size()];
//         for (int i=0; i<arr.size(); i++) {
//             answer[i] = arr.get(i).length();
//         }
//
//         // 리턴
//         return answer;
//     }
// }

// 단어를 담지말고 단어의 길이에 바로 담기
class Ex066 {
    public int[] solution(String myString) {
        // 데이터 준비
        List<Integer> arr = new ArrayList<>();
        String word = "";

        // "x"를 기준으로 나누기
        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                word += myString.charAt(i);
            } else {
                arr.add(word.length());
                word = "";
            }
        }
        arr.add(word.length()); // 마지막 한번 더 원소 더해주기

        // 리스트를 배열로 변환
        int[] answer = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        // 리턴
        return answer;
    }
}
