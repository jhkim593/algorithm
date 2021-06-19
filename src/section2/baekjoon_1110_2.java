package section2;


import java.util.*;

class baekjoon_1110_2{
    
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        int a=sca.nextInt();
        String temp;
        if(a<10){ temp="0"+String.valueOf(a);}
         else{ temp=String.valueOf(a);}
       int answer=0;
        while(true){
        int sum=(Integer.parseInt(temp.substring(0,1))+Integer.parseInt(temp.substring(1,2)))%10;
        String t=temp.substring(1,2)+String.valueOf(sum);
            answer++;
            if(Integer.parseInt(t)==a){
                break;
            }
            temp=t;
        }
        System.out.print(answer);
        Stack<String>ss=new Stack<>();
        ss.add("ss");
        ss.
        
    }
}



//import java.util.*;
//
//
//class Main{
//    
//    public static void main(String[]args){
//        Scanner sca=new Scanner(System.in);
//        String s=sca.next();
//       Integer []alp=new Integer[26];
//        for(int i=0;i<26;i++) {
//        	alp[i]=0;
//        }
//        
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)>=97){alp[s.charAt(i)-32-'A']++;}
//            else{alp[s.charAt(i)-'A']++;}
//            
//        }
//        
//       Integer[]alpc=Arrays.copyOf(alp, alp.length);
//       Arrays.sort(alpc,Collections.reverseOrder());
//       int max=alpc[0];
//       int count=0;
//       int index=0;
//       for(int i=0;i<alp.length;i++) {
//    	   if(alp[i]==max) {index=i; count++;}
//    	   if(count>1)break;
//       }
//       if(count>1) {System.out.println("?");}
//       else System.out.println((char)(index+'A'));
//       
//        
//        
//    }
//}