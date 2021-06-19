package section2;


import java.util.Scanner;
public class baekjoon_10809{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
		  String a=sca.next();
		  String[] c=a.split("");
		  
		  String[]b= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		  String[]d=new String[b.length];
		  for(int i=0;i<d.length;i++) {
			  d[i]="-1";
		  }
			  
		  for(int i=0; i<b.length;i++) {
			  for(int j=0;j<c.length;j++) {
				  
			  if(b[i].equals(c[j])) {
				  d[i]=String.valueOf(j);
				  break;
			  }
			  if(j==c.length-1) {
				  d[i]="-1";
			  }
			  
			  
			  
		  }
			 
		  }
		 for(int i=0;i<d.length;i++) {

			 
			 System.out.print(d[i]+" ");
		 }
		  
	  
	  }
		  
}


