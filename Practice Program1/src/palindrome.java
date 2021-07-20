import java.util.Scanner;

public class palindrome {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Something Chatacter :");
		String character =sc.nextLine();
		String reverse ="";
		for (int i=character.length()-1; i>=0; i--) {
			reverse =reverse+character.charAt(i);
			}
		System.out.println(reverse);
		if(character.equals(reverse)) { 
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		
		}
		
		
		
	}

}
