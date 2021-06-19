package section2;

import java.util.Arrays;
import java.util.Comparator;
class test7{
	
    public String solution(int[] numbers) {
   
    	
        String answer = "";
        String[] a=new String[numbers.length];
        for(int i=0;i<numbers.length;i++) {
        	a[i]=String.valueOf(numbers[i]);
        }
       Arrays.sort(a,new Comparator<String>() {

		@Override
		public int compare(String arg0, String arg1) {
			
			return (arg1+arg0).compareTo(arg0+arg1);
		}
    	   
       });
       if(a[0].equals("0"))return "0";

       for(int i=0; i<a.length;i++) {
    	   answer+=a[i];
       }
       
       return answer;
    }

	  public static void main(String[] args) {
			String []a= {"1","2","5","3","4"};
			Arrays.sort(a,new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o2.compareTo(o1);
				}
				
			});
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			
			
	  }		
}



