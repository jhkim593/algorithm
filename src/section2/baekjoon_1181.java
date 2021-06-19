package section2;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class baekjoon_1181{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
	  int count=sca.nextInt();
	  int index=0;
	 
	  ArrayList<String>list=new ArrayList<>();
	  for(int i=0;i<count;i++) {
		  String s=sca.next();
		 if(!list.contains(s)) {
			 list.add(s);
		 }
	  }
	  String[]a=new String[list.size()];
	  for(int i=0; i<list.size();i++) {
		  a[i]=list.get(i);
	  }
	
	  
	
//	 for(int i=0;i<a.length-1;i++) {
//		 for(int j=0;j<a.length-1-i;j++) {
//			 if(a[j].length()>a[j+1].length()) {
//				 String temp=a[j];
//				 a[j]=a[j+1];
//				 a[j+1]=temp;
//			 }
//			 else if(a[j].length()==a[j+1].length()) {
//				 if(a[j].compareTo(a[j+1])>0) {
//					 String temp=a[j];
//					 a[j]=a[j+1];
//					 a[j+1]=temp;
//				 }
//			 }
//		 }
//	 }
	  Arrays.sort(a);
	  Arrays.sort(a,new Comparator<String>() {

		@Override
		public int compare(String arg0, String arg1) {
			return Integer.compare(arg0.length(),arg1.length());
		}
		  
	  });
	 for(int i=0;i<a.length;i++) {
		 System.out.println(a[i]);
	 }
	  
}
}

