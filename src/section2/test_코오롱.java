package section2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class test_코오롱 {
	HashSet<String>set;
	ArrayList<String>list;
	public static void main(String[] args) {
		test_코오롱 t=new test_코오롱();
//		int anss=t.sol("FDCBA");
//     	int anss=t.sol("HZZHGFDCBA");
		String[]aa=t.sol("ABCD");
		for(int i=0;i<aa.length;i++) {
			System.out.println(aa[i]);
		}
		
		int first=0;
		int last=aa.length-1;
		int mid=0;
		while(first<=last) {
			mid=(first+last)/2;
			if(aa[mid]==n) {
				answer=n;
			}
			else {
				if(aa[mid]>n) {
					last=mid-1
				}
				else {
					first=mid+1;
				}
			}
		}
//		ArrayList<String>lisd=new ArrayList<>();
//		lisd.add("1");
//		lisd.add("5");
//		lisd.add("2");
//		Collections.sort(lisd);
//		for(int i=0;i<lisd.size();i++) {
//			System.out.println(lisd.get(i));
//		}
//		char[]c= {'c','c','a','b'};
//		System.out.println("===========");
//		System.out.println(String.valueOf(c,0,4));
//		
	
	}
	public String[] sol(String s) {
		String []temp=s.split("");
		int []visit=new int[temp.length];
		set=new HashSet<>();
		list=new ArrayList<>();
		dfs(4,temp,visit,"",0);
		String[]answer=new String[set.size()];
		String[]answer2=new String[list.size()];
		int index=0;
		for(String hs:set) {
			answer[index++]=hs;
		}
//		for(int i=0;i<list.size();i++) {
//			answer2[i]=list.get(i);
//		}
		
		Arrays.sort(answer);
		return answer;
//		int []answer3= {1,2,3,4};
//		int as=Arrays.binarySearch(answer3, 1);
//		return as;
//		int as=Arrays.binarySearch(answer, s);
//		if(as==answer.length-1)return as;
//		else return as+1;
//		int an=0;
//		for(int i=0;i<answer.length;i++) {
//			if(i==answer.length-1)an=i;
//			if(answer[i].equals(s)) {an= i+1;break;}
//		}
//		return an+1;
	}
	public void dfs(int len,String []temp,int[]visit,String ori,int index) {
		if(len==ori.length()) {
			set.add(ori);
			list.add(ori);
			return;
		}
		for(int i=index;i<temp.length;i++) {
			
				String nori=ori+temp[i];
				int[]newvisit=visit.clone();
				newvisit[i]++;
				dfs(len,temp,newvisit,nori,i+1);
			
		}
	}

}
