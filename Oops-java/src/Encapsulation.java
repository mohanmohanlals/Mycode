

public class Encapsulation {
	//example student
	private String name;
	private int age;
	public void setName(String setName) {
		name=setName;
	}
	public String getName() {
		return name;
	}
	public void setAge(int sage) {
		age=sage;
	}
	public int getAge() {
		return age;
	}
	public static void main(String [] args) {
		Encapsulation e =new Encapsulation();
		e.setName("mohan");
		e.setAge(20);
		//System.out.println(e.name);
		System.out.println(e.getName());
		System.out.println(e.getAge());
	}
	

}