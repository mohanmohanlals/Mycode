


class bird{
	public void sing() {
		System.out.println("tweet.. tweet.. tweet..");
	}
}
//
class mohan extends bird{
	public void sing() {
		//System.out.println("mohanlal................");      //two method call sing 
	}
	

}
public class polymorphism {

	public static void main(String[] args) {
		mohan b =new mohan();
		b.sing();

	}

}
