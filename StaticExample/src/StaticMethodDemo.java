class Mobile{
	int price;
	String brand;
	static String name;
	public void show() {
		System.out.println(brand +" : "+ price +" : " + name);
		System.out.println("in show");
	}
	public static void show1(Mobile obj) {
		System.out.println(obj.brand+" : "+ obj.price+" : "+obj.name);
		System.out.println("in static show1");
		
	}
	
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "samsung";
		m1.price = 123455;
		Mobile.name = "smart phone";
		
		Mobile.show1(m1);
	}

}
