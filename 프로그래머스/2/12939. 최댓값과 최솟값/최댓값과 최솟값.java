import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int[] splits = Arrays.stream(s.split(" "))
                     .mapToInt(Integer::parseInt)
                     .toArray();
        int max = Arrays.stream(splits).max().getAsInt();
        int min = Arrays.stream(splits).min().getAsInt();

        return min + " " + max;
    }
}