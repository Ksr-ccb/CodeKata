import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 유저가 누구에게 신고당했는지 저장하는 맵
        Map<String, Set<String>> reported = new HashMap<>();
        
        for (String id : id_list) {
            reported.put(id, new HashSet<>());
        }
        
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        for (String re : reportSet) {
            String[] split = re.split(" ");
            String from = split[0];
            String to = split[1];

            reported.get(to).add(from);
        }
        

        for (String id : id_list) {
            if (reported.get(id).size() >= k) {
                for (String reporter : reported.get(id)) {
                    int idx = Arrays.asList(id_list).indexOf(reporter);
                    answer[idx]++;
                }
            }
        }
        
        return answer;
    }
}
