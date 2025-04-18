import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;          

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies){
        List<Integer> answer = new ArrayList<>();
        
        Map<String, Integer> termsMap = new HashMap<>();
        for(String str : terms){
            String[] parts = str.split(" ");
            termsMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, dateFormat);
        
        for(int i = 0 ; i < privacies.length; i++){
            String[] parts = privacies[i].split(" "); //0 : 날짜 , 1 : key
            
            LocalDate date = LocalDate.parse(parts[0], dateFormat);
            LocalDate expireDate = date.plusMonths(termsMap.get(parts[1]));
            
            if(expireDate.isBefore(todayDate) || expireDate.isEqual(todayDate)){
                answer.add(i+1);
            }    
        }
        
        return  answer.stream().mapToInt(Integer::intValue).toArray();
    }
}