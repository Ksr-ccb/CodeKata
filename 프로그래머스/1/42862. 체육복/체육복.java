import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List<Integer> realReserve = new ArrayList<>();
        List<Integer> realLost = new ArrayList<>();
        
        for (int r : reserve) {
            if (!Arrays.stream(lost).anyMatch(l -> l == r)) {
                realReserve.add(r);
            }
        }

        for (int l : lost) {
            if (!Arrays.stream(reserve).anyMatch(r -> r == l)) {
                realLost.add(l);
            } else {
                answer++;
            }
        }
        
        
        for(int i : realLost){
            if(realReserve.contains(i-1)){
                answer++;
                realReserve.remove(realReserve.indexOf(i-1));
            }else if(realReserve.contains(i+1)){
                answer++;
                realReserve.remove(realReserve.indexOf(i+1));
            }
        }
        return answer;
    }
}