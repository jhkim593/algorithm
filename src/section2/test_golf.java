package section2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class test_golf {
	 int[]tx={0,1,0,-1};
	    int[]ty={1,0,-1,0};
	public static void main(String[] args) {
		String a="java and backend and junior and pizza 100";
		 String[]temp=a.split("and");
		 char z='c';
		 ArrayList<int[][]>list=new ArrayList<>();
		 
//		 a.contains(z);
		 int[]aa=new int[2];
		 int[]bb=new int[2];
		 int[][]aaa= {{1,2},{3,4}};
		 list.add(aaa);
		 int []z=aaa[0];
		 aa[0]=1;aa[1]=3;
		 bb[0]=1;bb[1]=3;
		 System.out.println(Arrays.equals(aa, bb));
//		for(int i=0;i<temp.length;i++) {
//			System.out.println(temp[i].trim());
//		}
//		ArrayList<ArrayList<Integer>>list=new ArrayList<>();
//		
//		ArrayList<Integer>temp;
//		temp=new ArrayList<>();temp.add(1);temp.add(2);temp.add(3);
//		list.add(temp);
//		temp.clear();temp.add(1);
//		list.add(temp);
//		temp.clear();temp.add(2);temp.add(111);
//		list.add(temp);
//		Collections.sort(list,(a1,a2)->{
//	           return a1.size()-a2.size(); 
//	        });
//		ArrayList<int[]>nnnn=new ArrayList<>();
//		int[]n= {1,2,3};
//		nnnn.add(n);
//		int[]nn= {1,2,3};
//		System.out.println(nnnn.contains(nn));
//		System.out.println(Arrays.equals(n, nn));
//		Map<String,Integer>map=new HashMap<>();
//		map.keySet();
//		  for(String s:map.keySet()){
//	            arr[index++]=map.get(s);
//	        }
//		test_golf t=new test_golf();
		
}
	public int[] solution(int rows, int columns, int[][] queries) {
	      
        int[][]arr=new int[rows][columns];
        int count=1;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=count++;
            }
        }
        for(int i=0;i<queries.length;i++){
            int rowa=queries[i][0];
            int cola=queries[i][1];
            int rowb=queries[i][2];
            int colb=queries[i][3];
            int temp=0;
            int x=rowa-1;
            int y=cola-1;
            int index=0;
            int cnt=arr[x][y];
            int min=cnt;
            while(index<4){
                
                x=x+tx[index];
                y=y+ty[index];               
                temp=arr[x][y];
                if(temp<min){min=temp;}
                arr[x][y]=cnt;
                cnt=temp;
              
              if(y==colb-1)index+=1;
              else if(x==rowa-1)index+=1;
              else if(x==rowb-1)index+=1;
              else if(y==cola-1)index+=1;
            }
            list.add(min);
        }
        int[]answer=new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
       
        return answer;
    }
}
