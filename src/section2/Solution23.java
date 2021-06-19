package section2;
class Solution23 {
    public String solution(String a,String b,int p,int q) {
    	StringBuilder st=new StringBuilder();
    	int sum=0;
     for(int i=0;i<a.length();i++) {
    	 sum+=Math.pow(p, i)*Integer.parseInt(a.substring(a.length()-1-i,a.length()-i));

     }
     for(int i=0;i<b.length();i++) {
    	 sum+=Math.pow(p, i)*Integer.parseInt(b.substring(b.length()-1-i,b.length()-i));
     }
     while(sum>0) {
    	st.append(String.valueOf(sum%q));
    	 sum/=q;
    		 
     }
     return st.reverse().toString();
    
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        String s1 = new String("112001");
		String s2 = new String("12010");
		int p = 3;
		int q = 8;
	String ret = sol.solution(s1, s2, p, q);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}