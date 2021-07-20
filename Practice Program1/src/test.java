import java.util.Scanner;



public class test {
	public static void main(String[] args) {
		 Thread t1 = new Thread();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			  int  s=i*3;
			 int  q=i*5;
			 boolean a=true;
		//System.out.println(s);
		//System.out.println(q);
			 if(s==q && a) {
				
				System.out.println("both");
			}
			 else if(s==q) {
				 System.out.println("fish");
			 }
  }
	}

}
