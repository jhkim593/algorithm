package section2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class baekjoon_10610{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
		  String a=sca.next();
		  String[] c=a.split("");
		  int index=0;
		  int sum=0;
		  
		  for(int i=0;i<c.length;i++) {
			  if(c[i].equals("0")) {index++;}
			  sum+=Integer.parseInt(c[i]);
		  }
		  if(index==0||sum%3!=0) {
			  System.out.println("-1");
		  }
		  else {
			  Arrays.sort(c,Collections.reverseOrder());
			  String answer="";
			  for(int i=0;i<c.length;i++) {
				 answer+=c[i];
			  }
			  System.out.println(Integer.parseInt(answer));
		  }
		
}
}

