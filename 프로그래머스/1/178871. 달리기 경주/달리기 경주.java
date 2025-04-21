import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players.clone();
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String calling : callings) {
            int index = map.get(calling);
            
            map.put(calling, index-1);
            map.put(answer[index-1], index);
            
            answer[index] = answer[index-1];
            answer[index-1] = calling;
        }
        
        return answer;
    }
}