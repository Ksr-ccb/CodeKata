import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> hamburger = Arrays.asList(1, 2, 3, 1);
        
        List<Integer> ingredientList = new ArrayList<>();
        for (int i : ingredient) {
            ingredientList.add(i);
            
            int size = ingredientList.size();
            
            if(size <4){
                continue;
            }else{
                if(ingredientList.subList(size-4,size).equals(hamburger)){
                    answer++;
                    ingredientList.subList(size-4, size).clear();
                }
            } 
        }
        
        return answer;
    }
}