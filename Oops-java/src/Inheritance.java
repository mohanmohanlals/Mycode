

public class Inheritance {
	//mouse example of inheritance  
     public static void leftclick() {
    	 System.out.println("clicked");
    	 }
     public static void rightclick() {
    	 System.out.println("clicked");
    	 
	}
     public static void scrollup() {
    	 System.out.println("scrolled up");
    	 
     }
     public static void scrolldown() {
    	 System.out.println("scrolled dowm");
     }
     //this 4 all mouse    --mouse2
     public class mouse extends Inheritance{
     public  void bluetooth() {
    	 System.out.println("conneted");
     }
     }
     public static void main(String[] args) {
    	 mouse m = new mouse();
    	 m.leftclick();
    	 m.bluetooth();
    	 
    	 
    
    	 
    	 
    	 
     }
}
