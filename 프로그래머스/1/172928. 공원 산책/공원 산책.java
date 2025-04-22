class Solution {
    public int[] solution(String[] park, String[] routes) {
        int xMax = park[0].length()-1;
        int yMax = park.length-1;
        
        int[] currentPos = new int[2];
        for( int i = 0; i<=yMax ; i++){
            int indexS = park[i].indexOf("S");
            if(indexS != -1){
                currentPos[0] = i;
                currentPos[1] = indexS;
                break;
            }
        }
        
        for(String route : routes){
            String op = route.split(" ")[0];
            int n = Integer.parseInt(route.split(" ")[1]);
        
            boolean isBlocked = false;
            
            switch (op){
                case "N":
                    if(currentPos[0]-n < 0) break;                    
                    for(int i = currentPos[0]; i >= currentPos[0]-n ; i--){
                        if(park[i].charAt(currentPos[1]) == 'X'){
                            isBlocked =true;
                            break;
                        }
                    }
                    if (!isBlocked) currentPos[0] -= n; 
                    break;
                case "W":
                    if(currentPos[1]-n < 0) break;                    
                    for(int i = currentPos[1]; i >= currentPos[1]-n ; i--){
                        if(park[currentPos[0]].charAt(i) == 'X'){
                            isBlocked =true;
                            break;
                        }
                    }
                    if (!isBlocked) currentPos[1] -= n; 
                    break;
                case "S":
                    if(currentPos[0]+n > yMax) break;                    
                    for(int i = currentPos[0]; i <= currentPos[0]+n ; i++){
                        if(park[i].charAt(currentPos[1]) == 'X'){
                            isBlocked =true;
                            break;
                        }
                    }
                    if (!isBlocked) currentPos[0] += n; 
                    break;
                case "E":
                    if(currentPos[1]+n > xMax) break;                    
                    for(int i = currentPos[1]; i <= currentPos[1]+n ; i++){
                        if(park[currentPos[0]].charAt(i) == 'X'){
                            isBlocked =true;
                            break;
                        }
                    }
                    if (!isBlocked) currentPos[1] += n; 
                    break;
            }
        }

        return currentPos;
    }
}