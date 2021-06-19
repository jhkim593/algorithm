package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
public class baekjoon_7785{
	
   

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int count=Integer.parseInt(br.readLine());
	StringBuilder st1=new StringBuilder();
	ArrayList<String>list=new ArrayList<String>();
	Map<String ,String>map=new HashMap<String,String>();
	for(int i=0;i<count;i++) {
		StringTokenizer st=new StringTokenizer(br.readLine());
		String a=st.nextToken();
		String b=st.nextToken();
		
		
		
		map.put(a,b);}
	br.close();
	Object[]answer=map.keySet().toArray();
	Iterator<String> it=map.keySet().iterator();
	while(it.hasNext()) {
		String a=it.next();
		
	}
	Arrays.sort(answer,Collections.reverseOrder());
	
	 
	
	
	for(int i=0;i<answer.length;i++) {
		String name=String.valueOf(answer[i]);
		if(map.get(name).equals("enter"))
			st1.append(name+"\n");
		
		
	}
	
	
	System.out.println(st1);
}}
//

