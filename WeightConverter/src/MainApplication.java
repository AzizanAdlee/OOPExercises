
public class MainApplication {

	public static void main(String[] args) {
		
		double yourMoonWeight;
		WeightConverter moonWeight;
		
		moonWeight = new WeightConverter(0.167);
		yourMoonWeight = moonWeight.convert(65);
		System.out.println("Your weight at moon is : "+ yourMoonWeight);
		
		
		venusConverter venusWeight;
		
		venusWeight = new venusConverter(0.9);
		double yourVenusWeight = venusWeight.venus(65);
		System.out.println("Your weight at venus is : "+ yourVenusWeight);
		
		
		jupiterConverter jupiterWeight;
		
		jupiterWeight = new jupiterConverter(2.5);
		double yourJupiterWeight = jupiterWeight.jupiter(65);
		System.out.println("Your weight at jupiter is : "+ yourJupiterWeight);
	}

}
