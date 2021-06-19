package section2;


import java.util.Scanner;
public class baekjoon_1541{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
		  int number=sca.nextInt();
		  
		  int a=100;
		  int answer=0;
		  int index=0;
		  
		  while(a!=number) {
			  if(index==0) {
				  a=number;
				  index++;
			  }
			 answer++;
//			  if(a<10) {
//				  
//			  }
			  int b=a%10;
			  int c=(a/10+a%10)%10;
			 
			  String sb=String.valueOf(b);
			  String sc=String.valueOf(c);
			  String sbc=sb+sc;
			 a=Integer.parseInt(sbc);
			  
			  
		  }
		  System.out.println(answer);
			
	  }		
}



