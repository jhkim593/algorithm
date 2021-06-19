package section2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class test9 {
	
		public int solution(int N,int[]board) {
//		
			int[][]newbo=new int[N][N];
			int[][]visit=new int[N][N];
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					visit[j][k]=0;
				}
				}
			
			int i=0;
				for(int j=0;j<N;j++) {
					for(int k=0;k<N;k++) {
						newbo[j][k]=board[i];
						i++;
					}
				}
			
			int o=N/2+1;
			int answer=0;
			Arrays.sort(a,new Comparator<String>() {

				@Override
				public int compare(String arg0, String arg1) {
					// TODO Auto-generated method stub
					return 0;
				}
				
			});
											
			while(true) {
				visit[o][o]=1;
				int[]next=new int[4];
				next[1]=newbo[o-1][o-1];
				next[2]=newbo[o+1][o+1];
				next[3]=newbo[o+1][o-1];
				next[4]=newbo[o-1][o+1];
				
					
				Arrays.sort(next);
				for(int k=0;k<4;k++) {
					if(next[k])
				}
			
				
				
			}
			
		
		

		return answer;
		
		}
		 public int comX(int a,int N) {
			 return a/N;
		 }
		 

		
		
			
		
		public static void main(String[] args) {
			test9 t=new test9();
			String s="BDAA";
			System.out.println(t.solution(s));
			
		}

}
