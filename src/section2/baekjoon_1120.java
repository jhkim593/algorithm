package section2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1120{
	
   

	  public static void main(String[] args) throws IOException {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  String a;
		 
	   a=br.readLine();
	   String []b=a.split(" ");
	   String []array1=b[0].split("");
	   String []array2=b[1].split("");
	   int min=0;
	   
	   
	   for(int i=0;i<array2.length-array1.length+1;i++) {
		   int answer=0;
		   int k=i;
		   for(int j=0;j<array1.length;j++) {
			   if(!array2[k].equals(array1[j]))answer++;
			   k++;
			   
		   }
		   if(min>answer||i==0) {
			   min=answer;
		   }
		   
	   }
	   System.out.println(min);

	  
}
}

