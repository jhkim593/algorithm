package section2;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class baekjoon_9012_2{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
		  int count=sca.nextInt();
		  List<String[]> que = new ArrayList<String[]>();
		  for(int i=0;i<count;i++) {
			
			  String array=sca.next();
			  String[]n=array.split("");
			  que.add(n);
			  
		  }
		  
//		  for(int i=0;i<count;i++) {
//			 
//			  int index1=0;
//			  int index2=0;
//			  int index3=0;
//			  for(int j=0;j<que.get(i).length;j++) {
//				  if(que.get(i)[j].equals("("))index1++;
//				  else {if(j==0&&que.get(i)[j].equals(")")) {
//					  index3++;
//				  }
//				  index2++;
//					  
//				  }
//			  }
//			  if(index1==index2&&index3==0) System.out.println("YES");
//			  else System.out.println("NO");
//			  
//		  }
		  for(int i=0;i<count;i++) {
				 
			  int index1=0;
			  int index2=0;
			  int index3=0;
			  int breakPoint=0;
			 
			 
			  for(int j=0;j<que.get(i).length;j++) {
				  if(que.get(i)[j].equals(")")&&j==0) {
					  System.out.println("NO");
					  breakPoint++;
					  break;
				  }
				  
			  
				  if(que.get(i)[j].equals("(")) {index1++;index2++;}
				  
				  else {
					  index1--;index3++;
				  }
				  if(index1<0) {
					  System.out.println("NO");
					  breakPoint++;
					  break;
				  }
				  
			 
		  }
			  if(index2!=index3&&breakPoint==0) {
				  System.out.println("NO");
			  }
			  else if(breakPoint==0)
			  System.out.println("YES");
			  
		  
		 
}
	  }
	  }

//import java.util.*;
//
//
//class Main{
//    
//    public static void main(String[]args){
//        Scanner sca=new Scanner(System.in);
//        int count=sca.nextInt();
//        
//       
//        for(int i=0;i<count;i++){
//            int cnt=0;
//            String a=sca.next();
//            Stack<String>s=new Stack<String>();
//            for(int j=0;j<a.length();j++){
//              if(a.substring(j,j+1).equals("(")){s.add("(");}
//              else {
//                  if(s.isEmpty()){cnt++;break;}
//                  else{s.pop();}
//              }
//            }
//        if(cnt==1){System.out.println("NO");}
//        else if(!s.isEmpty()){System.out.println("NO");}
//        else System.out.println("YES");
//        }
//       
//      }
//}
//
