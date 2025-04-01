class Solution { 
    public int solution(int[] nums) {
        
        int max = 3000;
        boolean[] noprime = new boolean[max + 1];
        
        // 2부터 시작하여, 소수가 아니면 그 배수들을 처리
        for (int i = 2; i * i <= max; i++) {  // 
            if (!noprime[i]) {  // i가 소수인 경우
                // i의 배수를 모두 소수 아님으로 표시
                for (int j = i * i; j <= max; j += i) {  
                    noprime[j] = true;  // 소수 아님
                }
            }
        }
        
        int answer = 0;

        for(int first = 0; first < nums.length-2; first ++){
            for(int second = first+1; second < nums.length-1; second ++){
                for(int third = second+1; third < nums.length; third ++){
                    int temp = nums[first] + nums[second] + nums[third]; 
                    if(!noprime[temp]){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

}


