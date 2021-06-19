package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2{
	
   

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int count=Integer.parseInt(br.readLine());
	br.close();
	int []arr=new int[count+1];
   
	arr[2] = 3;
	if(count%2!=0) {
		System.out.println(0);
	}
	else {
	for(int i=4; i <=count; i+=2){
	 arr[i]=arr[i-2]* 3;
	 for(int j=i-4;j>=2; j-=2){
	  arr[i]+=arr[j]*2;
	  
	 }
	 arr[i]+=2;
	}
	System.out.println(arr[count]);
	}
	}

	
}


