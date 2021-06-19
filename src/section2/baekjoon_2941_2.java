package section2;


import java.util.*;

public class baekjoon_2941_2{
    
    public static void main(String[]args){
        
        Scanner sca=new Scanner(System.in);
        String a=sca.next();
        String[]qu1={"c=","c-","d-","lj","nj","s=","z=","dz="};
        for(int i=0;i<qu1.length;i++) {
        	a.replace(qu1[i],"?");
        }
        System.out.print(a.length());
//        String[]qu1={"c=","c-","d-","lj","nj","s=","z="};
//        String[]qu2={"dz="};
//    
//    int index1=0;
//    int index2=index1+2;
//    int breakPoint=0;
//    int answer=0;
//  
// 
//   while(index2<=a.length()){
//       String b=a.substring(index1,index2);
//       for(int i=0;i<qu1.length;i++){
//           if(b.equals(qu1[i])){index1+=2;index2+=2;breakPoint++;answer++;break;}
//       }
//       if(breakPoint==0&&index2<a.length()){
//           b=a.substring(index1,index2+1);
//            for(int i=0;i<qu2.length;i++){
//           if(b.equals(qu2[i])){index1+=3;index2+=3;breakPoint++;answer+=2; break;}
//       }
//          
//       }
//       if(breakPoint==0){index1++;index2++;}
//       breakPoint=0;
//   }
//    System.out.print(a.length()-answer);
        
}
}