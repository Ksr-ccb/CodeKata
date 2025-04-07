import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i  = 0 ; i <lottos.length; i++){
            
            if(lottos[i] == 0){
                answer[0] ++;
                continue;
            }
            
            if(Arrays.binarySearch(win_nums, lottos[i]) >= 0){
                answer[0] ++;
                answer[1] ++;
            }
        }
        
        if( answer[0] == 0 || answer[0] == 1){
            answer[0] = 6;
        }else{
            answer[0] = 7 - answer[0];
        }
        
        if( answer[1] == 0 || answer[1] == 1){
            answer[1] = 6;
        }else{
            answer[1] = 7 - answer[1];
        }
        
        
        return answer;
    }
}