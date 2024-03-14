public class Inky {
	
	public Inky (String x) {
		System.out.println(x);
	}
	public Inky (String x, String y, String z) {
		System.out.println(y + " " + x);
		System.out.println(x + " " + z);
		System.out.println(y + " " + x + " " + z);
	}
	
	public static void main(String[] args) {
		String pinky = "donkey";
		String blinky = "pinky";
		String rinky = "monkey";
		
		Inky ponkey = new Inky(pinky);
		Inky ponkey2 = new Inky(pinky, blinky, rinky);
	}
}