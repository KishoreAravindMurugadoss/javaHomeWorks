class dad {
	int a = 5000;
	void watch() {
		System.out.println("dad owns a watch which can be accessed by his son and himself");
		System.out.println("the value of the watch is "+a);
	}
}
class son extends dad{
	int b = 150000;
	void bike() {
		System.out.println("son owns a bike");
		System.out.println("the value of the bike is "+b);
	}
}
public class InheritDemo {

	public static void main(String[] args) {
		son c = new son();
		System.out.println("therefore son has the assets worth of ");
		System.out.println(c.a+c.b);
		c.bike();
		c.watch();
		}
}
