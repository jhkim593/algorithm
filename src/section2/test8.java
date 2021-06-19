package section2;

import java.util.Arrays;

public class test8 {
	
		public int solution(int[]A,int S) {
			int answer=0;
			for(int a=1;a<A.length;a++) {
				
				for(int j=0;j<A.length;j+=a) {
					int []b=new int[a];
					int sum=0;
				b=Arrays.copyOfRange(A, j,j+a);
				for(int k=0;k<b.length;k++) {
					sum+=b[k];
				}
				if(sum>=S){answer=a;break;}
			}
				if(answer!=0) {
					break;
				}
			}
		return answer;
		
		
		}
		public static void main(String[] args) {
			int []a= {1,10,2,9,3,8,4,7,5,6};
			int b=20;
			test8 t=new test8();
			System.out.println(t.solution(a, b));
			
		}

}
