package section2;


import java.util.*;
import java.io.*;

class tttd{
    static int[][]arr;
    static int []check;
    static int []ans;
    static ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st=new StringBuilder();
       int a= Integer.parseInt(br.readLine());
       
        check=new int[a+1];
        ans=new int[a+1];
        for(int i=0;i<=a;i++) {
        	list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<a-1;i++){
            String[]s=br.readLine().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            list.get(x).add(y);
            list.get(y).add(x);
        }
        br.close();
        search(1);
        for(int i=2;i<ans.length;i++){
        st.append(ans[i]+"\n");
        }
        System.out.print(st);
    }
    static void search(int x){
       
        check[x]=1;
        for(int a:list.get(x)){
            if(check[a]==0){
                check[a]=1;
                ans[a]=x;
                search(a);
            }
            }
        }
    
}