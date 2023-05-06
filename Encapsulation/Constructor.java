class Human1{
	private String name;
	private int age;
	public Human1() {
		age = 1;
		name = "Mr.X";
	}
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
public class Constructor {

	public static void main(String[] args) {
		Human1 obj = new Human1();
		//obj.SetName("kishore"); i have these lines commented to check whether the constructor is working or not
		//obj.SetAge(21);
		System.out.println(obj.GetName()+" : "+obj.GetAge());

	}

}
