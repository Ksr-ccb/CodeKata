import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int rows = commands.length;
    
        int[] answer = new int[rows];
    
        for(int i = 0; i< rows ; i++){
            
            
            if(commands[i][0] == commands[i][1]){
                answer[i] = array[commands[i][0]-1];
            }else{
                int[] tempArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); // 배열잘라왔따.
                Arrays.sort(tempArr);
                answer[i] = tempArr[commands[i][2]-1];
            }
        }
        
        return answer;
    }
}