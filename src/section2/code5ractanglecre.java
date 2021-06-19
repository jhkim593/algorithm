package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class code5ractanglecre {
	
	static myractangle1cre[] rects=new myractangle1cre[1000];
	
	static int n=0;

	public static void main(String[] args) {
	    
		try { 
			Scanner in =new Scanner (new File("Untitled 9"));
			while(in.hasNext()) {
			int x=in.nextInt();
			int y=in.nextInt();
			
	
			int w=in.nextInt();
			int h=in.nextInt();
			rects[n]=new myractangle1cre(x,y,w,h);
			
			
			
			n++;
			
			}
			
			in.close();
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("no data file");
			System.exit(1);
		}
		bublesort();
		
		for(int i=0;i<n;i++) {
			rects[i].tostring();
		}
		
		
	}

	private static void bublesort() {
		for (int i=1;i<n;i++) {
			for(int j=0; j<n-i;j++) {
				if(rects[j].cal()>rects[j+1].cal()) {
					myractangle1cre tmp;
					tmp=rects[j];
					rects[j]=rects[j+1];
					rects[j+1]=tmp;
				}
			}
		}
		 
		
	}
	
	
}
