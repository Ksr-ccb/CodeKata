import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        
        List<Integer> kValues = new ArrayList<>();
        int[] answer = new int[score.length];
 
        for (int i = 0; i < score.length; i++) {
            kValues.add(score[i]);
            Collections.sort(kValues);
            
            if (kValues.size() > k) {
                kValues.remove(0);
            }
            answer[i] = Collections.min(kValues);
        }
        
        return answer;
    }
}