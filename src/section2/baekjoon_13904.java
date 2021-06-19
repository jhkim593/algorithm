package section2;


import java.util.*;

class baekjoon_13904{
    
    public static void main(String[]args) {
    Scanner sca=new Scanner(System.in);
    int count=sca.nextInt();
    int[][]arr=new int[count][2];
    for(int i=0;i<count;i++){
        arr[i][0]=sca.nextInt();
        arr[i][1]=sca.nextInt();
        
    }
    Arrays.sort(arr,new Comparator<int[]>(){
        public int compare(int[] a,int []b){
            if(a[0]==b[0])return b[1]-a[1];
            else{return b[0]-a[0];}
        }
       
    });
 
 
    int answer=0;
    int day=arr[0][0];
    int max=0;
    int s=0;
       for(int i=day;i>0;i--){
    	max=0;
    	for(int j=0;j<count;j++) {
        if(i<=arr[j][0]){
        	if(arr[j][1]!=0&&max<arr[j][1]) {max=arr[j][1];s=j;}
        			}
        
    }
    	answer+=max;
    	arr[s][1]=0;
    }
   System.out.println(answer);
  
     }}