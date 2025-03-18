class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if( c == 32){ //공백
                answer.append(" ");
                continue;
            }
            
            if( c > 64 && c < 91){ //대문자 자리바꿈
                if(c+n > 90){
                    c = (char)(64 + (c+n)%90);
                    answer.append(c);
                }else{
                    c = (char)(c + n);
                    answer.append(c);
                }
            }else{
                if(c+n > 122){
                    c = (char)(96 + (c+n)%122);
                    answer.append(c);
                }else{
                    c = (char)(c + n);
                    answer.append(c);
                }
            }
        }
        
        return String.valueOf(answer);
    }
}