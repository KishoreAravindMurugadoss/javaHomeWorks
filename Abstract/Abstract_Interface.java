abstract class Computer{
	public abstract void code();
}
class Laptop extends Computer{
	public void code() {
		System.out.println("code, compile, run");
	}
}
class Desktop extends Computer{
	public void code() {
		System.out.println("code, compile, run - faster");
	}
}
class Developer{
	public void devApp(Computer desk) {
		desk.code();
	}
}






public class Abstract_Interface {

	public static void main(String[] args) {
		Computer lap = new Laptop();
		Computer desk = new Desktop();
		Developer kishore = new Developer();
		kishore.devApp(lap);
			

	}

}
