import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        answer.append(s);
        
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);
        
        numberMap.forEach((key, value)->{
            
            int startIndex = answer.indexOf(key);
            while (startIndex != -1) {
                answer.replace(startIndex, startIndex + key.length(), value.toString());
                startIndex = answer.indexOf(key);
            }
        });    
        
        return Integer.parseInt(String.valueOf(answer));
    }
}