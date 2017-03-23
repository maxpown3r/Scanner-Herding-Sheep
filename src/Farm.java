
public class Farm {
	
	private Sheep[] arrayOfSheep;
	private Dog d1;
	private String name;
	
	public Farm(String nameFarm, Dog d, Sheep[] sillySheep){
		name = nameFarm;
		d1 =  d;
		arrayOfSheep = new Sheep[sillySheep.length];
		for(int i = 0; i<sillySheep.length; i++){
			arrayOfSheep[i] = sillySheep[i];
		}
		if(sillySheep.length > d1.herd()){
			throw new IllegalArgumentException("There are too many sheep for this breed of dog to herd.");
		}
	}
	public String getName(){ //implicitly scopes name from this class
		return name;
	}
	public int getNumSheep(){
		return arrayOfSheep.length;
	}
	//prints farm name, name of dog, and names and ages of all the sheep.
	public void printFarm(){
		
		System.out.print(name + " " + d1.getName());
		
		for(int i = 0; i<arrayOfSheep.length; i++){
			String sheepName = arrayOfSheep[i].getName();
			int sheepAge = arrayOfSheep[i].getAge();
			System.out.println("sheep name: " + sheepName + " sheep age: " + sheepAge);
		}
	}
	public double getWool(){
		double totalWoolWeight = 0;
		for(int i = 0; i<arrayOfSheep.length; i++){
			totalWoolWeight += arrayOfSheep[i].shear();
		}
		return totalWoolWeight;
	}	
}
