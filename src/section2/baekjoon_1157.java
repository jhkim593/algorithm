package section2;


import java.util.Arrays;
import java.util.Scanner;
public class baekjoon_1157{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
		  String a=sca.next();
		  String[] c=a.split("");
		  
		  String[]b= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		  String[]e={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		  int[]d=new int[b.length];
		  int[]f=new int[b.length];
		  for(int i=0;i<b.length;i++) {
			  d[i]=0;
			  f[i]=0;
		  }
		  
		  for(int i=0;i<c.length;i++) {
			  for(int j=0;j<b.length;j++) {
				  if(c[i].equals(b[j])) d[j]++;
				  if(c[i].equals(e[j]))f[j]++;
			  }
		  }
		  int []sum=new int[d.length];
		  for(int i=0;i<d.length;i++) {
			 
				  sum[i]=d[i]+f[i];
			  }
		  Arrays.sort(sum);
		  int answer=sum[d.length-1];
		  
		  for(int i=0;i<d.length;i++) {
			  
			  if(answer==sum[d.length-2]) {
				  System.out.println("?");
				  break;}
				 
			 if(d[i]+f[i]==answer) {
				 
					 System.out.println(e[i]);
					 break;
			 }
				
					
				 
			 }
		  }
		  
		  
	 
		 
}



