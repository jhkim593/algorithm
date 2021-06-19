package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
public class baekjoon_10814{
	
   

	  public static void main(String[] args) {
	 
		Scanner sca = new Scanner(System.in);
		int count=sca.nextInt();
		String[][]array=new String[count][2];
		for(int i=0;i<count;i++) {
		  array[i][0]=sca.next();
		  array[i][1]=sca.next();
		}
		Arrays.sort(array,new Comparator<String[]>() {

			@Override
			public int compare(String[] arg0, String[] arg1) {
				// TODO Auto-generated method stub
			return Integer.parseInt(arg0[0])-(Integer.parseInt(arg1[0]));
			}
			
		});
		
		for(int i=0;i<count;i++) {
		System.out.println(array[i][0]+" "+array[i][1]);}
	  
	
}
	  }

