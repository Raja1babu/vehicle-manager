public class vehicle{
	public static void main(String[] args) {
		PetrolEngine pE = new PetrolEngine();
		pE.start();
		pE.stop();
		
		DeselEngine dE = new DeselEngine();
		dE.start();
		dE.stop();
	}
}