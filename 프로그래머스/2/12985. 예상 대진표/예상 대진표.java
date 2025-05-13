class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        int currentA = a;
        int currentB = b;
        while(true){
            if( currentA % 2 == 1){
                currentA ++;
            }
            
            if( currentB % 2 == 1){
                currentB ++;
            }
            
            if( currentA == currentB ){
                return answer;
            }else{
                currentA /=2;
                currentB /=2;
                answer++;
            }
            
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");
    }
}