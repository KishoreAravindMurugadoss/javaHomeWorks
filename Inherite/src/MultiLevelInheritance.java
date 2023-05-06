class grandpa {
	int p = 5000000;
	void property() {
		System.out.println("grandpa own a property which can be accessed by his son, his grandson and by himself");
		System.out.println("the value of the property is "+p);
	}
}

class daddy extends grandpa{
	int a = 5000;
	void watch() {
		System.out.println("dad owns a watch which can be accessed by his son and himself");
		System.out.println("the value of the watch is "+a);
	}
}
class grandson extends daddy{
	int b = 150000;
	void bike() {
		System.out.println("son owns a bike");
		System.out.println("the value of the bike is "+b);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		grandson c = new grandson();
		System.out.println("therefore grandson has the assets worth of ");
		System.out.println(c.a+c.b+c.p);
		c.bike();
		c.watch();
		c.property();
	}

}
