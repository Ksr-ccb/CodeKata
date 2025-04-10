class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int x = 0;
        int nonx = 0;
        
        char charX = s.charAt(0);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == charX){
                x ++;
            }else{
                nonx ++;
            }
            
            if(x == nonx){
                answer ++;
                if(i < s.length()-1){
                    charX = s.charAt(i+1);
                }
                x=0;
                nonx=0;
            }else if(i == s.length()-1 ){
                answer ++;
                break;
            }
        }
        return answer;
    }
}