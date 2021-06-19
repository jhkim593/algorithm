package section2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class baekjoon_1357{
	
	public int trans(int x) {
		String []a=String.valueOf(x).split("");
		
	
		String sumA="";
	
	
		for(int i=0;i<a.length;i++) {
			  sumA+=a[a.length-1-i];
		  }
		return Integer.parseInt(sumA);
		
		
		
	}
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
		  int x=sca.nextInt();
		  int y=sca.nextInt();
		  baekjoon_1357 b=new  baekjoon_1357();
		  int sum=b.trans(x)+b.trans(y);
		  System.out.println(b.trans(sum));
		 
		 
		
}
}

