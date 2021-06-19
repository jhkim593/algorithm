package section2;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class baekjoon_1764{
	
   

	  public static void main(String[] args) throws IOException {
	  Scanner sca = new Scanner(System.in);
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int a=sca.nextInt();
	  int b=sca.nextInt();
//	  List<String>lista=new ArrayList<>();
	  Set<String>lista=new HashSet<>();
	  List<String>listc=new ArrayList<>();
	
	  
	  for(int i=0;i<a;i++) {
		  lista.add(sca.next());
	  }
	  for(int i=0;i<b;i++) {
		  String s=sca.next();
		  if(lista.contains(s)) {
			  listc.add(s);
		  }
	  }
	  
	  
	  
//	  for(int i=0;i<a;i++) {
//		  if(listb.contains(lista.get(i))){
//			  listc.add(lista.get(i));
//		  }
//	  }
	  String[]answer=new String[listc.size()];
	  for(int i=0; i<listc.size();i++) {
		  answer[i]=listc.get(i);
	  }
	  Arrays.sort(answer);
	  System.out.println(answer.length);
	  for(int i=0;i<answer.length;i++) {
		  System.out.println(answer[i]);
	  }
	  
}
}

