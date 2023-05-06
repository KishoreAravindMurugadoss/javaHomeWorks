class Human{
	private String name;
	private int age;
	public String GetName () {
		return name;
	}
	public int GetAge () {
		return age;
	}
	public void SetName (String name) {
		
		this.name = name;
	}
	public void SetAge (int age) {
		
		this.age = age;	
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.SetName("kishore");
		obj.SetAge(21);
		System.out.println(obj.GetName()+" : "+obj.GetAge());

	}

}
