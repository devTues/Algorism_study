
class Solution {
    public String solution(String my_string) {
        int length = my_string.length();
        String answer = "";
        
        for (int i = length - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}