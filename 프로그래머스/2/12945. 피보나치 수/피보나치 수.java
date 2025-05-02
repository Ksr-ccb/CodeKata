class Solution {
    public int solution(int n) {
    
        int answer = 1;
        int n2 = 0;

        //int answer = 0;

        for( int i = 1; i< n ; i++){
            int temp = n2;
            n2 = answer;
            answer = (temp + answer)%1234567;   
        }
        return answer;
    }
}