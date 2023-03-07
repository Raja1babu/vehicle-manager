public class vehicle{
	public static void main(String[] args) {
		PetrolEngine pE = new PetrolEngine();
		pE.start();
		pE.stop();
		
		DeselEngine dE = new DeselEngine();
		dE.start();
		dE.stop();
		
		ElectricEngine eE = new ElectricEngine();
		eE.start();
		eE.stop();
		
		HydrogenEngine hE = new HydrogenEngine();
		hE.start();
		hE.stop();
	}
	
}