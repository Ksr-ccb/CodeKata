class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean newWord = true; 

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                newWord = true;
            } else {
                if (newWord) {
                    answer.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    answer.append(Character.toLowerCase(c)); // 나머지 글자는 소문자
                }
            }
        }
        return answer.toString();
    }
}
