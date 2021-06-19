package section2;


import java.util.Scanner;
public class baekjoon_8958{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
	  int count=sca.nextInt();
	  for(int j=0;j<count;j++) {
		  
	  String a=sca.next();
	  int ans=0;
	  int sum=0;
	  String[]b=a.split("");
	  for(int i=0;i<b.length;i++) {
		  if(b[i].equals("O")) {
			  ans++;
			  sum+=ans;
		  }
		  else {
			  ans=0;
		  }
	  }
	  
	  System.out.println(sum);
	  }
		  
}
}

