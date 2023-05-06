import java.util.*;
abstract class Car{
	public abstract void welcomeMessage();
	public void start() {
		System.out.println("Engine is turned ON.");
	}
	public void route() {
		System.out.println("Plese choose the destination.");
	}
	public void routeResponse() {
		System.out.println("the shortest route available is selected.");
	}
	public void drive(){
		System.out.println("driving is enabled.");
	}
	public void playMusic() {
		System.out.println("Wanna hear some Music? If YES, press y else press n");
		Scanner YesNo = new Scanner(System.in);
		String yesno = YesNo.nextLine();
		if(yesno.equals("y") ) {
			System.out.println("playing music");
		}
		else if(yesno.equals("n")) {
			System.out.println("Looks like you are not in the mood!");
		}
		else {
			System.out.println("Invalid Input!");
		}
	}
	public void destinationAlert() {
		System.out.println("Arrived at your destination.");
	}
	public abstract void automaticPark();//just declearing the method for now and will be defined in the class which exends this abstact class
	public void parked() {
		System.out.println("Vehicle parked sucessfully. Now it is safe to undo your seat belt.");
	}
}
abstract class Nano extends Car{
	String CarName = "Nano";
	public void welcomeMessage() {
		System.out.println("Welcome to " + CarName+". Please Buckle up your Seat Belts. Have a pleasent journey.");
	}
	public abstract void automaticPark();
}
class UpdatedNano extends Nano{
	public void automaticPark() {
		System.out.println("Automatic park feature is enabled.");
	}
}




public class AbstractDemo {

	public static void main(String[] args) {
		UpdatedNano obj = new UpdatedNano();
		obj.welcomeMessage();
		obj.start();
		obj.route();
		obj.routeResponse();
		obj.playMusic();
		obj.drive();
		obj.destinationAlert();
		obj.automaticPark();
		obj.parked();
	}

}
