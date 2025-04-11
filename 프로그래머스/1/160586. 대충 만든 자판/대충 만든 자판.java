class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i< targets.length ; i++){  //타깃 배열
            for(char t : targets[i].toCharArray() ){ //타깃 스트링
                int keyClick = 200;
                
                for(String keys : keymap){ //키맵 배열
                    int findIndex = keys.indexOf(String.valueOf(t));
                    if( findIndex == -1){
                        continue;
                    }else{
                        keyClick = Math.min(keyClick, findIndex + 1);
                    }
                }
                if(keyClick == 200){
                    answer[i] = -1;
                    break;
                }
                answer[i] += keyClick;
            }   
        }
        return answer;
    }
}