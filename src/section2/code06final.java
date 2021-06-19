package section2;

import java.util.Scanner;

public class code06final {
	
static poly[] po =new poly[1000];
	
	static int n=0;
	static int f=0;

	public static void main(String[] args) {
		
		
		
		Scanner in=new Scanner(System.in);
		
		while(true) {
			String command=in.next();
			
			if(command.equals("create")) {
				char name=in.next().charAt(0);
				po[n]=new poly();
				po[n].name=name;
				n++;
				
			}
			
			else if(command.equals("add")) {
		
			char name =in.next().charAt(0);
			
			int index=find(name);
			if(index==-1) {
				System.out.println("No serch");
				
			}
			else {
				
				int c=in.nextInt();
				int d=in.nextInt();
				if(findterm(index,d)!=-1) {
					po[index].terms[findterm(index,d)].coef+=c;	
					
				}
				else {
			po[find(name)].terms[f]=new Term(c,d);
			
			f++;
			}
			}
			}
			
			
		
			else if(command.equals("calc")) {
				char name=in.next().charAt(0);
				int a=in.nextInt();
				int index=find(name);
				if (index==-1) {
					System.out.println("No serch");
				}
				else {
					double sum=0;
					for(int i=0;i<f;i++) {
						sum=sum+Math.pow(a,po[find(name)].terms[i].exp)*(po[find(name)].terms[i].coef);
					}
					System.out.println(sum);
					
				}
					
				
			}
		
			else if(command.equals("print")) {
				
				char name=in.next().charAt(0);
				
				int index=find(name);
				if (index==-1) {
					System.out.println("No serch");
				}
				else {
					for(int i=0 ;i<f;i++) {
						System.out.print(po[find(name)].terms[i].coef+"x"+"^"+po[find(name)].terms[i].exp);
						if(i!=f-1) {
							System.out.print("+");
						}
				}
				
				}
			}
		
			else if(command.equals("exit")) {
				break;
			}

	}

}

	private static int findterm(int a, int d) {
		for(int i=0; i<f;i++) {
			if(po[a].terms[i].exp==d) {
				return i;
			}
		}
		return -1;
		
	}

	private static int find(char name) {
		for(int i=0; i<n;i++) {
			if(po[i].name==name) {
				return i;
			}
		}
		return -1;
	}
}
