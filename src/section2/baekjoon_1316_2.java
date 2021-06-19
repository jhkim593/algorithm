package section2;


import java.util.*;


class baekjoon_1316_2{
    
    public static void main(String[]args){
        
        Scanner sca= new Scanner(System.in);
        int count=sca.nextInt();
        
        int answer=0;
        for(int i=0;i<count;i++){
            String a=sca.next();
            int[] num=new int [26];
            char cur=' ';
            answer++;
           for(int j=0;j<a.length();j++){
               if(j==0){cur=a.charAt(j); num[a.charAt(j)-'a']=1;}
              else{
                  if(cur!=a.charAt(j)){
                      if( num[a.charAt(j)-'a']==1){answer--;break;}
                  }
                  num[a.charAt(j)-'a']=1;
                  cur=a.charAt(j);
              }
           }
           
       
    }
        System.out.println(answer);
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
//        int answer=0;
//        for(int j=0;j<count;j++){
//            String s=sca.next();
//            int[]arr=new int[26];
//            char temp=s.charAt(0);
//            
//            answer++;
//            for(int i=1;i<s.length();i++){
//                if(s.charAt(i)==temp){temp=s.charAt(i);}
//                else{
//                    if(arr[s.charAt(i)-'a']==0){
//                    arr[s.charAt(i-1)-'a']++;temp=s.charAt(i);
//                }
//                    else{answer--;break;}
//                    }
//            }
//            
//        }
//        System.out.print(answer);
//    }
//}