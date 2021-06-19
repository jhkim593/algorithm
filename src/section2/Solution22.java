package section2;
class Solution22 {
    public String solution(String[]arr) {
    	String[][] newarr=new String[arr.length][arr.length];
    	StringBuilder st=new StringBuilder();
    	int i=0;int j=0;
   for(String a:arr) {
	   j=0;
	   for(int k=0;k<a.length();k++) {
	   newarr[i][j]=a.substring(j,j+1);
	   j++;
   }
	   i++;
   }
   i=0;j=0;
   int sw=1;
   int N=arr.length-1;
   for(int k=0;k<arr.length;k++) {
	   st.append(newarr[i][k]);
   }
   i=0;
   j=arr.length-1;
   while(N>0) {
	   for(int k=0;k<N;k++) {
		   i=i+sw;
		   st.append(newarr[i][j]);
		  
		  
	   }
	   sw*=-1;
	   for(int x=0;x<N;x++) {
		   j=j+sw;
		   st.append(newarr[i][j]);
		   
	   }
	   N-=1;
   }
  return st.toString();
   
    }
    

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        String s1 = new String("112");
		String s2 = new String("121");
		String s3 = new String("100");
	
		String[] arr= {s1,s2,s3};
		
	String ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}