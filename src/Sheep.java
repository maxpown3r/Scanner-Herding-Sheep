import java.util.Random;

public class Sheep {
	private String name;
	private int age;
	private boolean hasWool;	

	//random number generator
	private static int seed = 123;
	private static Random numberGenerator = new Random(seed);		
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public Sheep(String startName, int startAge){
		name = startName;
		age = startAge;
		hasWool = true;
	}
	public double shear(){
		if(hasWool = false){
			return 0; 
		}
		hasWool = false;
		double x = numberGenerator.nextDouble();
		double weightWool = 10 - (4*x);
		return weightWool;		
	}	
}
