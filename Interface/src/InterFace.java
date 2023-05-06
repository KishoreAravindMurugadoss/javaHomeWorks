interface A{
	void Show();
	void Config();
}
interface X{
	void Run();
}
interface Y extends X{
}
class B implements A,Y{
	public void Show() {
		System.out.println("showing");
	}
	public void Config() {
		System.out.println("Configuration set up");
	}
	public void Run() {
		System.out.println("Running...");
	}
}
public class InterFace {

	public static void main(String[] args) {
		A obj = new B();
		obj.Config();
		obj.Show();
		Y obj1 = new B();
				
		obj1.Run();
		
	}

}
