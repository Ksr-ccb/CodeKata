class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int rest = n;
        
        while( rest >= a){
            answer += (rest/a)*b ;
            rest = (rest/a)*b + rest%a;
        }
        
        return answer;
    }
}