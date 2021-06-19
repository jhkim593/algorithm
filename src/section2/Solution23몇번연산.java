package section2;
class Solution23몇번연산 {
    public Integer solution(int a,int b) {
    	int answer=0;
    while(a!=b) {
    	if(a>b) {
    		a-=1;
    		answer++;
    	}
       if(a<b) {
    	   if(Math.abs(b-a*2)>Math.abs(b-(a+1))) {
    		   a+=1;
    		   answer++;
    	   }
    	   else {a*=2;answer++;}
       }
       }
    return answer;
    }
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution23몇번연산 sol = new Solution23몇번연산();
        int number1 = 5;
		int target1 = 9;
		int ret1 = sol.solution(number1, target1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = sol.solution(number2, target2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}