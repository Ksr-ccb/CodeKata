import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int[] correctArr = new int[3];
        
        for(int i = 0; i<answers.length; i++){
            if( answers[i] == first[i%first.length]){
                correctArr[0] ++;
            }
            
            if( answers[i] == second[i%second.length]){
                correctArr[1] ++;
            }
            
            if( answers[i] == third[i%third.length]){
                correctArr[2] ++;
            }
            
        }
        
        int max = Arrays.stream(correctArr)
                .max()
                .orElse(0);
        
        List<Integer> answer = new ArrayList<>();
        
        if( correctArr[0] == max ){
            answer.add( 1 );
        }
        
        if( correctArr[1] == max ){
            answer.add( 2 );
        }
        if( correctArr[2] == max ){
            answer.add( 3 );
        }
        
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}