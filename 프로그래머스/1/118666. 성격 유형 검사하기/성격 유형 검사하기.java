import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        int[] count = new int[4];
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('C', 1);
        map.put('J', 2);
        map.put('A', 3);
        
        for(int i = 0; i< survey.length ; i++){
            char temp = survey[i].charAt(0);
            if(map.containsKey(temp)){
                count[map.get(temp)] += 4 - choices[i];
            }else{
                count[map.get(survey[i].charAt(1))] += choices[i] - 4;
            }
        }
        
        answer.append(count[0]<0 ? "T" : "R");
        answer.append(count[1]<0 ? "F" : "C");
        answer.append(count[2]<0 ? "M" : "J");
        answer.append(count[3]<0 ? "N" : "A");
        
        
        return answer.toString();
    }
}