import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {
        int[] copy = Arrays.copyOf(emergency, emergency.length); // emergency 배열을 복사
        Arrays.sort(copy); // 크기순서대로 정렬
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < copy.length; i++) {
            map.put(copy[i], copy.length - i); // 응급도와 우선순위 번호 매칭하여 저장
        }
        
        int[] answer = new int[emergency.length]; // 우선순위 번호 저장할 새로운 배열 생성
        
        for(int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]); // 원래 응급도에 해당하는 우선순위 번호를 새로운 배열에 저장
        }
        
        return answer;
    }
}