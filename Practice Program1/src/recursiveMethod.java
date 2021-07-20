import java.util.Scanner;

public class recursiveMethod {
	public static void main(String [] args) {
		//Scanner sc =new  Scanner(System.in);
		//System.out.println("Enter A Number  : ");
		//int n =sc.nextInt();
		
		System.out.print(recursive(3));
	}
	public static  int recursive(int n) {
		if(n==0) {
			System.out.println("Done");
		}
		else {
			System.out.println(n);
			n--;
			recursive(n);
		}
		return n;
	}

}
  