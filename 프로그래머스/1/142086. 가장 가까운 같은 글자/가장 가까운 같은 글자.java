import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Set<Character> charsets = new HashSet<>();
        
        for( int i = 0 ; i<s.length() ; i++){
            if(!charsets.contains(s.charAt(i))){
                answer[i] = -1;
                charsets.add(s.charAt(i));
            }else{
                int count = 1;
                for(int j = i-1 ; j >= 0; j--){
                    if(s.charAt(j) == s.charAt(i)){
                        answer[i] = count;
                        break;
                    }
                    count++;
                }
            }
        }
        
        return answer;
    }
}