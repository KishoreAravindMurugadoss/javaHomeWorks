class A{
	public A() {
		super();
		System.out.println("A default constructor");
	}
	public A(int n) {
		super();
		System.out.println("A parameterised constructor");
		}
}
class B extends A{
	public B() {
		super();
		System.out.println("B default constructor");
	}
	public B(int n) {
		this();
		System.out.println("B parameterised constructor");
		}
	
}

public class ConstructorSuper {

	public static void main(String[] args) {
		B obj = new B(5);
		
	}

}
