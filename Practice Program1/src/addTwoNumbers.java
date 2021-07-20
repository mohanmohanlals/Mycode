
import java.util.Scanner;

public class addTwoNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a first number :");
		int num1=sc.nextInt();
		System.out.println("Enter a secound number :");
		int num2 =sc.nextInt();
		System.out.println("+,-,*,/");
		char sembel=sc.next().charAt(0);
		switch (sembel) {
		case '+': System.out.println(num1+num2); break;
		case '-': System.out.println(num1-num2); break;
		case '*': System.out.println(num1*num2); break;
		case '/': System.out.println(num1/num2); break;
		}
	}

}