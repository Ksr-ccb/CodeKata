import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int element : elements){ //길이 1개인거
            set.add(element);
        }
        
        int n = elements.length;
        for(int length = 2; length <= n; length++){ //길이가 2개부터 n개까지
            for(int offset = 0 ; offset < n; offset ++){
                int sum = 0;                
                for(int i = 0 ; i < length; i++){ // 길이 만큼 더하기
                    sum += elements[(offset + i) % n];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}