package section2;






import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class baekjoon_1620{
	
   

	  public static void main(String[] args)   {
	  Scanner sca = new Scanner(System.in);
	  
	  int counta=sca.nextInt();
	  int countb=sca.nextInt();
	  HashMap<String,Integer>map=new HashMap<String,Integer>();
	  List<String>list=new ArrayList<String>();
	  List<String>lista=new ArrayList<String>();
	  String[]sort=new String[counta];
	  HashSet<Character>set=new HashSet<>();
	  
	  for(int i=0;i<counta;i++) {
		  String s=sca.next();
		  map.put(s,i+1);
		  list.add(s);
	  }
	
	  
	 
	  for(int i=0;i<countb;i++) {
		  if(sca.hasNextInt()) {
			 int num=sca.nextInt();
			 lista.add(list.get(num-1));
			 
		  }
		  else {
			  String ch=sca.next();
			 
			  lista.add(String.valueOf(map.get(ch)));
		  }
	  }
	  for(int i=0;i<lista.size();i++) {
		  System.out.println(lista.get(i));
	  }
	  
}
	  
	
}

//import java.util.*;
//
//
//class Main{
//    
//    public static void main(String[]args){
//    Scanner sca=new Scanner(System.in);
//        int a=sca.nextInt();
//        int b=sca.nextInt();
//        Map<String,Integer>map1=new HashMap<>();
//       String[]arr=new String[a];
//        StringBuilder st=new StringBuilder();
//        for(int i=0;i<a;i++){
//            String s=sca.next();
//            map1.put(s,i+1);
//            arr[i]=s;
//        }
//        for(int i=0;i<b;i++){
//            
//            if(!sca.hasNextInt()){
//                String temp=sca.next();
//                st.append(map1.get(temp)+"\n");
//            }
//            else{
//                int temp=sca.nextInt();
//                st.append(arr[temp-1]+"\n");
//        }
//        }
//        System.out.print(st);
//    }
//}
//
