import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> answer = new ArrayList<String>();
        
        for(int i = 0; i < strings.length ; i ++){
            answer.add(strings[i].charAt(n) + ":" + strings[i]); // c:abce c:abcd x:cdx 일케만듬
        }
        
         Collections.sort(answer); //정렬해줌
             
        for(int i = 0; i < answer.size() ; i ++){
            answer.set(i , answer.get(i).split(":")[1]); // c:abce 를 : 가준으로 자르면 [c][abce] 로 나눠지니깐...
        }
        
        
        return answer.toArray(String[]::new);
    }
}