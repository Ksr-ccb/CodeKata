import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i  = 0; i < numbers.length-1; i++){
            int next = i + 1 ;
            
            for(int j = next; j < numbers.length; j++){
                int temp = numbers[i] + numbers[j];
                
                if(! answer.contains(temp)){
                    answer.add(temp);
                }                
            }
            
        }
        
        Collections.sort(answer);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}