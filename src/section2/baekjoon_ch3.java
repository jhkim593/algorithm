package section2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class baekjoon_ch3{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
	  int pl=0;
	  int mi=0;
	  int index=0;
		 
		  String str=sca.nextLine();
		  String[]a=str.split("\\-");
		  
		 
		  for(String b:a) {
			  
			  if(b.contains("+")) {
				  String[]c=b.split("\\+");
				  for(String d:c) {
					  if(index==0) {
						  pl+=Integer.parseInt(d);
						  
					  }
					  else
						  mi+=Integer.parseInt(d);
						 
				  }
				  index++;
				  
				  
			  }
			  else {
				 if(index==0) {
					 pl+=Integer.parseInt(b);
					 index++;
				 }
				 else
			  mi+=Integer.parseInt(b);
		  }
		  
		  
	  }
		  System.out.println(pl-mi);
}
}
		
	 




