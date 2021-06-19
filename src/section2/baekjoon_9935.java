package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class baekjoon_9935{
	
   

	  public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
//	  Integer[][]aaa= {{1,1,2},{4,3,1},{2,3,1}};
//	  Arrays.sort(aaa, (a,b)->{
//		  return a[0].compareTo(b[1]);
//	  });
//	 
//	  for(int i=0;i<aaa.length;i++) {
//		  for(int j=0;j<aaa[0].length;j++) {
//			  System.out.print(aaa[i][j]);
//		  }
//		  System.out.println();
//	  }
	
	 
   
	  String s=br.readLine();
	  String bom=br.readLine();
	  int index=0;
	  int plus=0;
	  
	  char[] ch=new char[s.length()];
	  for(int i=0;i<s.length();i++) {
		  ch[index]=s.charAt(i);
		  
		 if(index>bom.length()-2) {
			 for(int j=0;j<bom.length();j++) {
			if(ch[index-j]==bom.charAt(bom.length()-1-j)) {
				plus++;
			}
			else break;
		 }
			 }
		if(plus==bom.length()) {
			 index-=bom.length();
			 }
		  plus=0;
		  index++;
	  }
	  if(index==0) {
		  System.out.println("FRULA");
		  
	  }
	  else {
	
		 System.out.println(String.valueOf(ch,0,index));
	 }
	  
}
	  }

