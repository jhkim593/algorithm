package section2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
public class programmers_메뉴리뉴얼 {
	String[]arr;
    HashSet<String>comp;
	public static void main(String[] args) {
		String []a={"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"	};
		int[]b= {2,3,4};
		programmers_메뉴리뉴얼 p=new programmers_메뉴리뉴얼();
		String []answer=p.solution(a,b);
		for(String s:answer) {
			System.out.println(s);
		}
	 
	}
	
	
	    public  String[] solution(String[] orders, int[] course) {
	        
	        
	        HashSet<String>set=new HashSet<>();
	        for(int i=0;i<orders.length;i++){
	            String[]s=orders[i].split("");
	            for(int j=0;j<orders[i].length();j++){
	                set.add(s[j]);
	            }
	        }
	        arr=new String[set.size()];
	        int[]visit=new int[set.size()];
	        int index=0;
	        for(String s:set){
	            arr[index++]=s;
	        }
	        List<String>anlist=new ArrayList<>();
	        for(int i=0;i<course.length;i++){
	             comp=new HashSet<>();
	            List<String>list=new ArrayList<>();
	            dfs(course[i],visit,"");
	          for(String s:comp){
	              int count=0;
	              int max=0;
	              con:
	              for(String o:orders){
	              for(int j=0;j<s.length();j++){
	                  
	                 if(!o.contains(s.substring(j,j+1))){
	                     continue con;
	                      
	                  }
	              }
	                  count++;
	              }
	              if(count>=2){
	                  if(max<count){list.clear();list.add(s);max=count;}
	                  else if(max==count){list.add(s);}
	              }
	                  
	          }
	            for(int k=0;k<list.size();k++){
	                anlist.add(list.get(i));
	            }
	            
	        }
	        String[]answer=new String[anlist.size()];
	        for(int i=0;i<anlist.size();i++){
	            answer[i]=anlist.get(i);
	        }
	        Arrays.sort(answer);      
	        
	           
	                
	              Map<String,String>m=new HashMap<String,String>();
	              
	      
	        
	        return answer;
	    }
	public  void dfs(int len,int[]visit,String ori){
	      for(int i=0;i<arr.length;i++){
	          if(visit[i]==0){
	              int[]newvisit=visit.clone();
	              String nori=ori+arr[i];
	              newvisit[i]++;
	              
	              if(nori.length()==len){
	                  comp.add(nori);
	              }
	              else{
	                  dfs(len,newvisit,nori);
	              }
	          }
	      }
	}
	    
	}
