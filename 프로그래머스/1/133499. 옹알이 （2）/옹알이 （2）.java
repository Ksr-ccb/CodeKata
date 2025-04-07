class Solution {
    public int solution(String[] babbling) {
        String[] standard = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(String bab : babbling){
            int babbled = -1;
            boolean canBabble = true;
            
            for(int i=0 ; i<bab.length(); i ++){
                if(!canBabble) break;
                
                switch(bab.charAt(i)){
                    case 'a' : 
                        if(i + 3 <= bab.length()
                          && bab.substring(i, i+3).equals(standard[0])
                          && babbled != 0){
                            babbled = 0;
                        }else{
                            canBabble = false;
                            break;
                        }
                        i = i + 2;
                        
                        break;
                    case 'y' : 
                        if(i + 2 <= bab.length()
                          &&bab.substring(i, i+2).equals(standard[1])
                          && babbled != 1){
                            babbled = 1;
                        }else{
                            canBabble = false;
                            break;
                        }
                        i = i + 1;
                        
                        break;
                    case 'w' : 
                        if(i + 3 <= bab.length()
                          &&bab.substring(i, i+3).equals(standard[2])
                          && babbled != 2){
                            babbled = 2;
                        }else{
                            canBabble = false;
                            break;
                        }
                        i = i + 2;
                        
                        break;
                    case 'm' : 
                        if(i + 2 <= bab.length()
                          &&bab.substring(i, i+2).equals(standard[3])
                          && babbled != 3){
                            babbled = 3;
                        }else{
                            canBabble = false;
                            break;
                        }
                        i = i + 1;
                        
                        
                        break;
                    default :
                        canBabble = false;
                        break;
                }
            }
            
            if(canBabble){
                answer ++;
            }
        }
        
        
        return answer;
    }
}