package section2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_10820{
	
   

	  public static void main(String[] args) throws IOException {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  String a;
		  
	   while((br.readLine())!=null) {
		   a=br.readLine();
		   int big=0;
		   int small=0;
		   int num=0;
		   int blank=0;
		   for(int i=0;i<a.length();i++) {
			   int asc=a.charAt(i)-'0';
			   if(asc>=49&&asc<=74) small++;
			   else if(asc>=17&&asc<=42)big++;
			   else if(asc==-16)blank++;
			   else if(asc>=0&&asc<=9)num++;
				   
			 
		   }
		   System.out.println(small+" "+big+" "+num+" "+blank);
	   }
		 
		 
		 

	  
}
}

