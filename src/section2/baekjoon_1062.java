package section2;


import java.util.*;


class Main{
    
    public static void main(String[]args){
        
       Scanner sca=new Scanner(System.in);
        int count=sca.nextInt();
        int target=sca.nextInt();
        int[]alp=new int[26];
        String alpabet="antic";
        String[]arr=new String[count];
        
        for(int i=0;i<count;i++){
            String a=sca.next();
            arr[i]=a.substring(4,a.length()-4);
        }
        if(target<5){System.out.print(0);}
        else{
            alp[0]=1;alp['n'-'a']=1;alp['t'-'a']=1;alp['i'-'a']=1;alp['c'-'a']=1;
            int rt=target-5;
            
            Arrays.sort(arr, new Comparator<String>(){
               public int compare(String a,String b){
                   int al=0;
                   int bl=0;
                  for(int i=0;i<a.length();i++){
                      if(alpabet.contains(a.substring(i,i+1))){al++;}
                  }
                   for(int j=0;j<b.length();j++){
                        if(alpabet.contains(a.substring(j,j+1))){bl++;}
                   }
                   if((a.length()-al)==(b.length()-bl))return a.compareTo(b);
                   return (a.length()-al)-(b.length()-bl);
                  
                   
               } 
            });
            
            
        }
        
    }
}