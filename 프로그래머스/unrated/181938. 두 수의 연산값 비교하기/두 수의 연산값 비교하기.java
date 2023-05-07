class Solution {
    public int solution(int a, int b) {
        int plusAB = Integer.parseInt(String.valueOf(a) + String.valueOf(b)); // a와 b를 연결한 값을 계산
        int mutiAB = 2 * a * b; // 2 * a * b 계산

        
        if(plusAB > mutiAB) {
            return plusAB;
        } else if(plusAB < mutiAB){
            return mutiAB;
        } else {
            return plusAB;
        }
        
    }
        
    
}