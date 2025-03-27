class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int cards1Index = 0;
        int cards2Index = 0;
        
        for(int i =0 ; i< goal.length; i++){
            String temp = goal[i];
            
            if(temp.equals(cards1[cards1Index])){
                if(cards1Index < cards1.length-1){
                    cards1Index ++;
                }
            }else if( temp.equals(cards2[cards2Index]) ) {
                if(cards2Index < cards2.length-1){
                    cards2Index ++;
                }
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}