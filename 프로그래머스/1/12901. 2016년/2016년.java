import java.util.HashMap;
class Solution {
    public String solution(int a, int b) {
        
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "THU");
        map.put(1, "FRI");
        map.put(2, "SAT");
        map.put(3, "SUN");
        map.put(4, "MON");
        map.put(5, "TUE");
        map.put(6, "WED");
        
        int totalDay = b;
        
        for(int i = 1; i < a; i++){
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    totalDay += 31;
                    break;
                case 2:
                    totalDay += 29;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDay += 30;
                    break;
            }
        }
        
        return map.get(totalDay%7);
    }
}