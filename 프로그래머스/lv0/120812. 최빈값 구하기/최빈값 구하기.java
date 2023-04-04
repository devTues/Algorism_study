import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        int maxCnt = 0;
        int answer = -1;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<array.length; i++) {
            int cnt = map.getOrDefault(array[i], 0) + 1;
                map.put(array[i], cnt);
            
            if(cnt > maxCnt) {
                maxCnt = cnt;
                answer = array[i];
            } else if(cnt == maxCnt) {
                answer = -1;
            }
        }
        return answer;
    }
}