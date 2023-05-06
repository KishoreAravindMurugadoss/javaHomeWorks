interface 


abstract class Dog {
	String breed;
	public void bark () {
		System.out.println("bark bark!");
		}
	public void poop () {
		System.out.println("dog pooped!");
	}
	public void howl() {
		System.out.println("dog is howling!");
	}
	public void sleep() {
		System.out.println("dog is sleeping.");
	}
	
	
}
class chihuahua extends Dog {
	public void ears() {
		System.out.println("Chihuahuas have big ears");
	}
}
class pomeranian extends Dog {
	public void ears() {
		System.out.println("Pomeranians have small ears");
	}
}
public class AbstrctTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chihuahua c = new chihuahua();
		pomeranian p = new pomeranian();
		c.bark();
		c.poop();
        c.sleep();
        c.howl();
        c.ears();
        p.bark();
		p.poop();
        p.sleep();
        p.howl();
        p.ears();

        
	}

}
