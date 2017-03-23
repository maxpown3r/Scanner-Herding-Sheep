
public class Dog {
	
	private String name;
	private String breed;
		
	public Dog(String startName, String startBreed){
		name = startName;
		breed = startBreed;
	}
	
	public String getName(){
		return name;
	}
	
	public int herd(){
		String lowerCaseBreed = breed.toLowerCase();
		
		if(lowerCaseBreed.contains("collie") == true){
			return 20;
		}
		if(lowerCaseBreed.contains("shephard") == true){
			return 25;
		}
		if(lowerCaseBreed.contains("kelpies") == true || lowerCaseBreed.contains("teruvens") == true){
			return 30;
		}else{
			return 10;
		}			
	}
}
