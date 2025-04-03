class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int n=1; n<=number; n++){ 
            int temp = n;
            int measure = 0;
            for (int i = 1; i * i <= n; i++) {
                if (i * i == n) {
                    measure++;
                }else if (n % i == 0) {
                    measure += 2;
                }
                
                if (measure > limit){
                    measure = power;
                    break;
                }
            }
            answer += measure;
        }
        
        return answer;
    }
}