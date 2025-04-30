class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String binary = "";
        while(!binary.equals("1")){
            //0제거
            int index = sb.indexOf("0");
            while (index != -1){
                sb.replace(index, index + 1, ""); 
                answer[1]++;
                index = sb.indexOf("0", index);
            }

            //2진수 변환
            binary = Integer.toBinaryString(sb.length());
            answer[0]++;
            sb.setLength(0);
            sb.append(binary);
        }
    
        return answer;
    }
}