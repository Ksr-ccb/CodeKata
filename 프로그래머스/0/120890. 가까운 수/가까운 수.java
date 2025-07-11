class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        

        for(int i : array){
            
            if(Math.abs(n-i) <Math.abs(n-answer) ){            
                answer = i;
            }
            
            if(Math.abs(n-i) == Math.abs(n-answer)){
                if(i < answer){
                    answer = i;
                }
            }

        }
        return answer;
    }
}