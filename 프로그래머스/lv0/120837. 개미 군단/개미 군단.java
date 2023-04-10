class Solution {
    public int solution(int hp) {
        int answer = 0; // 필요한 개미의 수
        int remainHp = hp; // 남은체력
        
        int[] antPowers = {5,3,1}; // 공격력
        
        for(int i = 0; i < antPowers.length; i++) {
            int antPower = antPowers[i]; //해당 개미의 공격력
            int antNum = remainHp / antPower;
            answer += antNum;
            remainHp %= antPower;
            
        }

        return answer;
    }
}