package section2;


import java.util.*;
import java.io.*;
public class baekjoon_1225{
	
  
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer stz=new StringTokenizer(br.readLine());
	String a=stz.nextToken();
	String b=stz.nextToken();
	
	String []arr1=a.split("");
	String[]arr2=b.split("");
	long sum=0;
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			sum+=Integer.parseInt(arr1[i])*Integer.parseInt(arr2[j]);
		}
	}
	System.out.println(sum);
	
	
   
  
}}
//

