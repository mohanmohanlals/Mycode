

abstract class Dog{
	String breed;
	
	public abstract void poop();  //it is abstraction method 

public void bark() {
	System.out.println("barked!!");
   }

}
class chichi extends Dog{
	public void poop() {
		System.out.println("Dog pooped");
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
		chichi c =new chichi();
		c.bark();
		c.poop();
		
	}

}
