package section2;




import java.util.Scanner;
public class baekjoon_14503{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
	  int n=sca.nextInt();
	  int m=sca.nextInt();
	  int x=sca.nextInt();
	  int y=sca.nextInt();
	  int d=sca.nextInt();
	  int answer=0;
	  int index=0;
	  int[][]wall=new int[n][m];
	  int[][]array=new int[n][m];
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<m;j++) {
			int num=sca.nextInt();
			array[i][j]=num;
			wall[i][j]=num;
			  
		  }
	  }
//	  for(int i=0;i<n;i++) {
//		  for(int j=0;j<m;j++) {
//			 System.out.println(array[i][j]);
//		  }
//	  }
	  if(array[x][y]==0) {
	  array[x][y]=1;
	  answer++;}
	

	
	  while(true) {
		 if(d==0) {
			

			 if(array[x][y-1]==0&&wall[x][y-1]==0) {
				 array[x][y-1]=1;
				 y-=1;
				 answer++;
				 d=3;
				 index=0;
			 }
			 else {
				 index++;
				 d=3;
			 }
			 
		 }
		 else if(d==1) {
			 if(array[x-1][y]==0&&wall[x-1][y]==0) {
				 array[x-1][y]=1;
				 x-=1;
				 answer++;
				 d=0;
				 index=0;
			 }
			 else
				 index++;
				 d=0;
			 
		 }
		 else if(d==2) {
			 if(array[x][y+1]==0&&wall[x][y+1]==0) {
				 array[x][y+1]=1;
				 y+=1;
				 answer++;
				 d=1;
				 index=0;
			 }
			 else {
				 index++;
				 d=1;
			 }
		 }
		 else {
			 if(array[x+1][y]==0&&wall[x+1][y]==0) {
				 array[x+1][y]=1;
				 x+=1;
				 answer++;
				 d=2;
				 index=0;
			 }
			 else { index++;d=2;}
			 
		 }
		 if(index==4) {
			 int samx; int samy;
			 if(d==0) { samx=x+1;  samy=y;}
			 else if(d==1) { samx=x;samy=y-1;}
			 else if(d==2) { samx=x-1; samy=y;}
			 else{samx=x; samy=y+1;}
			 
			 if(samx<0||samy<0||samx>n-1||samy>m-1||wall[samx][samy]==1) {
				 break;
			 }
			 else {x=samx;y=samy;index=0;}
		 }
		
		  
	  }
	  System.out.println(answer);
	  
		
}
}

