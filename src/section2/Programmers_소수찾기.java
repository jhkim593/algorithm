package section2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
	public static void main(String[] args) {
		
	}

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
			 for(int j=0;j<a.length;j++) {
				 visit[j]=0;
			 }
			 search("",visit,len);
			 
		 }
		List<String>li=new ArrayList<>();
	
	
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
                     {codnum.add(Integer.parseInt(nori));}
				 }
				 
			 }
		 }
		 
	 }
	 static boolean isPrime(int a) {
		 if(a<=1) {return false;}
		 for(int i=2;i<a;i++) {
			 if(a%i==0) {return false;}
		 }
		 return true;
		 
	 }
	 
}


//import java.util.*;
//
//class Solution {
//    static HashSet<Integer>set;
//    public int solution(String numbers) {
//        int answer = 0;
//        String []num=numbers.split("");
//        set=new HashSet<>();
//        for(int i=0;i<num.length;i++){
//            set.add(Integer.parseInt(num[i]));
//        }
//        for(int i=2;i<=num.length;i++){
//             int []visit=new int[num.length];
//			 for(int j=0;j<num.length;j++) {
//				 visit[j]=0;
//			 }
//            dfs(i,"",visit,num);
//        }
//        
//        for(Integer temp:set){
//            if(isPrime(temp))answer++;
//        }
//        return answer;
//    }
//    public void dfs(int len,String ori,int[]visit,String[]num){
//        for(int i=0;i<num.length;i++){
//            if(visit[i]==0){
//                
//                String nori=ori+num[i];
//                
//                int[]newvisit=visit.clone();
//                newvisit[i]++;
//           
//            if(nori.length()==len){
//                set.add(Integer.parseInt(nori));
//            }
//            else{
//                dfs(len,nori,newvisit,num);
//            }
//        }
//        }
//    }
//    public boolean isPrime(int temp){
//        if(temp<2)return false;
//        for(int i=2;i<=temp-1;i++){
//                if(temp%i==0)return false;
//            }
//        return true;
//    }
//}

public void dfs(int len,String ori,int[]visit,String[]num){
    if(ori.length()==len){
        set.add(Integer.parseInt(ori));
        return;
    }
     for(int i=0;i<num.length;i++){
         if(visit[i]==0){
             String nori=ori+num[i];
             int[]newvisit=visit.clone();
             newvisit[i]++;
             dfs(len,nori,newvisit,num);
         }
     }
 }