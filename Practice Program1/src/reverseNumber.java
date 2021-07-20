import java.util.Scanner;
public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a somthing number :");
		int number =sc.nextInt();
		int res=0;
		while(number>0) {
			res=(res*10)+number%10;
			number=number/10;
		}
		System.out.println(res);

	}

}
