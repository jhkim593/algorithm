package section2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
public class baekjoon_10942{
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	int size=Integer.parseInt(br.readLine());
	StringTokenizer stz=new StringTokenizer(br.readLine());
	int[]arr=new int[size];
    for(int i=0;i<size;i++) {
    	arr[i]=Integer.parseInt(stz.nextToken());
    	
    }
    int count=Integer.parseInt(br.readLine());
    for(int i=0;i<count;i++) {
    	StringTokenizer stz1=new StringTokenizer(br.readLine());
    	int x=Integer.parseInt(stz1.nextToken());
    	int y=Integer.parseInt(stz1.nextToken());
    	
    	int []newarr=Arrays.copyOfRange(arr, x-1,y );
    	if(!cheack(newarr)) {
    		bw.write("0\n");
    	}
    	else{bw.write("1\n");}
    }	
    br.close();
    bw.flush();
    bw.close();
		
    	
}
	
	static boolean cheack(int[] newarr) {
		for(int j=0;j<newarr.length/2;j++) {
			if(newarr.length==1) {return true;}
            if(newarr[j]!=newarr[newarr.length-1-j]) {
         	  return false;
            }
            
            
          
 	}
 	return true;
 }
	
		
	
}
//

