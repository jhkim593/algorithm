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
public class baekjoon_1543{
	
   

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String st=br.readLine();
	String target=br.readLine();
	
	
   
    String[] b=st.split(target);
    String bl="";
    for(int i=0;i<b.length;i++) {
    	bl+=b[i];
    }
    int a=st.length()-bl.length();
    System.out.println(a/target.length());
   
}}
//

