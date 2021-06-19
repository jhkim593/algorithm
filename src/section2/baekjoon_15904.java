package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
public class baekjoon_15904{
	
   

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String[]ucpc= {"U","C","P","C"};
	String[]arr=br.readLine().split("");
	int index=0;
	int breakPoint=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i].equals(ucpc[index])) {
			index++;
		}
		if(index==4) {
			breakPoint++;
			break;
			
		}
	}
	if(breakPoint!=0) {
		System.out.println("I love UCPC");
	}
	else {
		System.out.println("I hate UCPC");
	}
	
   
  
}}
//

