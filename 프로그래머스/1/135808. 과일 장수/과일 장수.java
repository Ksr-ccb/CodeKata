import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int index = score.length;
        
        while( index >= m ){
            answer += score[index - m] *m;
            index -= m;
        }
        
        
        return answer;
    }
}