import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] cntX = new int[10];
        int[] cntY = new int[10];

       for (char x : X.toCharArray()) {
            cntX[x-'0'] ++;
        }
       for (char y : Y.toCharArray()) {
            cntY[y-'0'] ++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i =9 ; i >=0 ; i--) {
            int repeatCnt = Math.min(cntX[i], cntY[i]);
            for( int j = 0; j <repeatCnt; j++){
                answer.append(i);
            }
        }

        if(answer.length() == 0){
            return "-1";
        }
        
        if (answer.toString().equals("0".repeat(answer.length()))) {
            return "0";
        }
        
        return answer.toString();
    }
}