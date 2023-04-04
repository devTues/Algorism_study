import java.util.HashMap;

class Solution {
    public int[] solution(int[] num_list) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("even", 0);
        map.put("odd", 0);
        
        for(int num : num_list) {
            if(num % 2 == 0) {
                map.put("even", map.get("even") +1);
            } else {
                map.put("odd", map.get("odd") +1);
            }
        }
        int [] answer = {map.get("even"), map.get("odd")};
        return answer;
    }
}