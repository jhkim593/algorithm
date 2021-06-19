package section2;

import java.util.Scanner;

public class code6final2 {
	
	private poly[] po =new poly[1000];
	
	private  int n=0;
	private  int f=0;
	
	private void addfu() {
    
		
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
			po[index].nterms++;
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
					
					po[index].calc(a);
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

	public static void main(String[] args) {
		
		code6final2 c=new code6final2();
		c.addfu();
		
}

	private  int findterm(int a, int d) {
		for(int i=0; i<f;i++) {
			if(po[a].terms[i].exp==d) {
				return i;
			}
		}
		return -1;
		
	}

	private  int find(char name) {
		for(int i=0; i<n;i++) {
			if(po[i].name==name) {
				return i;
			}
		}
		return -1;
	}
}
