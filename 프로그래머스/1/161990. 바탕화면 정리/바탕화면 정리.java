class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50,50,0,0};
        
        for( int i = 0; i < wallpaper.length; i++ ){
            int index = wallpaper[i].indexOf("#");
            
            while(index!=-1){
                answer[0] = answer[0] > i ? i : answer[0];
                answer[1] = answer[1] > index ? index : answer[1];
                answer[2] = answer[2] < i+1 ? i+1 : answer[2];
                answer[3] = answer[3] < index+1 ? index+1 : answer[3];
                
                index = wallpaper[i].indexOf("#", index+1);
            }
        }
        
        return answer;
    }
}