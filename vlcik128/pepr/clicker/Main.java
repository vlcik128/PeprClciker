package vlcik128.pepr.clicker;

public class Main {
	public static PeprClicker pc;
	private static void log(String s){
		System.out.println(s);
	}
	public static void main(String[] args){
		log("PepøClicker BETA 0.2 by vlcik128 is going to be enabled.");
		log("System aktualizacii sa pripravuje");
		// Aktualizacie
		pc = new PeprClicker();
	}
	
}
