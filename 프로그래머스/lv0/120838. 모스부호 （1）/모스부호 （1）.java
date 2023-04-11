import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<String, Character> map = new HashMap<>(); // 유형을 저장할 Map 생성
        for(int i = 0; i < morse.length; i++) {
            map.put(morse[i], (char)(97+i));
        } 
        
        String[] words = letter.split(" ");
        for(String w : words) {
            answer += map.get(w);
        }
        return answer;
    }
}