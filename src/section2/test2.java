package section2;

import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
	ArrayList<Integer>codnum=new ArrayList<>();
	 String[] a;
	 int answer=0;
	
	 public int solution(String numbers) {
		 
		 a=numbers.split("");
		 for(String s:a) {
			 if(!codnum.contains(Integer.parseInt(s)))
			 codnum.add(Integer.parseInt(s));
		 }
		 for(int i=1; i<a.length;i++) {
			 int len=i+1;
			 int []visit=new int[a.length];
			 for(int j=1;j<a.length;j++) {
				 visit[j]=0;
			 }
			 search("",visit,len);
			 
		 }
		 
		 
		 for(Integer b:codnum) {
			 if(isPrime(b)) {answer++;
		 }}
				 	        
	        return answer;
	    }
	 
	 public void search(String ori,int[]visit,int len) {
		 for(int i=0;i<visit.length;i++) {
			 if(visit[i]==0) {
				var nori=ori;
				 nori+=a[i];
				 int []newvisit=new int[visit.length];
				 System.arraycopy(visit, 0, newvisit, 0, visit.length);
				 newvisit[i]=1;
				 if(nori.length()<len) {
					 search(nori,newvisit,len);
					 
				 }else {
					 if(!codnum.contains(Integer.parseInt(nori)))
						 codnum.add(Integer.parseInt(nori));
				 }
				 
			 }
		 }
		 
	 }
	 static boolean isPrime(int a) {
		 if(a<=1) {return false;}
		 for(int i=2;i<=a;i++) {
			 if(a%i==0) {return false;}
		 }
		 return true;
		 
	 }
	 
	 public void searchComb(String ori,int[]visit,int len) {
		 
	 }
		public static void main(String[] args) {
			
			
		}

}
