
public class Dog extends Animal {
	public void eat () {
		System.out.println("chow chow chow method overriding");
	}
	public void eat(int numberOfTimes){
		System.out.println("method overloading");
		for (int i=0; i < numberOfTimes ; i++) {
			System.out.println("chow chow");
		}
	}
}
