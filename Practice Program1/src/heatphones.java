
public class heatphones {
	String type="bluetooth";
	String color="blue";
	String[] control= {"power","volume","play/pause" };
	int price=1500;
	
	
	static boolean button =false;
	static int volume=0;
	
	public static void volumeup() {
		volume++;
		
	}
	public static void volumedown() {
		volume--;
	}
	
	public static void play(){
		button=true;
	}
	public static void pause() {
		button=false;
		
	}
	
	public static void main(String [] args) {
		
		heatphones heatset=new heatphones();
		System.out.println(heatset.price);
		System.out.println(heatset.volume);
		volumeup();
		System.out.println(heatset.volume);
         
		
		
		
	}
	

}
