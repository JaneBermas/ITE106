import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		lamp flourescent = new Lamp();
		Lamp incandescent = new Lamp();
		
		led.name = args[0];
		halogen.name = args[2];
		flourescent.name = args[0];
		incandescent.name = args[2];
		
		led.isOn = Boolean.parseBoolean(args[3]);
		flourescent.isOn = Boolean.parseBoolean(args[3]);
		flourescent.turnOn();
		System.out.println("Flourescent turned on by " + flourescent.name);
		led.turnOn();
		System.out.println("led turned on by " + led.name);
		halogen.isOn = Boolean.parseBoolean(args[1]);
		incandescent.isOn = Boolean.parseBoolean(args[1]);
		incandescent.turnOff();
		System.out.println("Incandescent turned on by " + incandescent.name);
		halogen.turnOff();
		System.out.println("halogen turned on by " + halogen.name);
	}
}