class Solution {
    public int[] solution(int brown, int yellow) {
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                int width = (yellow / i) + 2;
                int height = i + 2;
                
                int total = width * height;
                if (total - yellow == brown) {
                    return new int[] { width, height};
                }
            }
        }
        return null;
    }
}