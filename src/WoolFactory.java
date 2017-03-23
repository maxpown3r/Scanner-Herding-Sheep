import java.util.Scanner;
import java.util.Random;

public class WoolFactory {

  //The provided code generates random ages for sheep, and picks random names from the below array
  //You can modify this list of names as you wish (add/remove/replace elements).
  private static String[] namesForSheep = {"Cerdic","Cynric","Ceawlin","Ceol","Ceolwulf","Cynegils",
    "Cenwalh","Seaxburh","Aescwine","Centwine","Ceadwalla","Ine","Aethelheard","Cuthred","Cynewulf",
    "Berhtric","Egbert","Aethelwulf","Aethelbald","Aethelberht","Aethelred","Hengest","Aesc","Octa",
    "Eormenric","Aethelbert I","Eadbald","Earconbert","Egbert I","Hlothere","Oswine","Wihtred",
    "Aethelbert II","Sigered","Egbert II","Eadberht II","Cuthred","Baldred","Aethelfrith","Edwin","St. Oswald",
    "Oswiu","Ecgfrith","Aldfrith","Osred I","Cenred","Osric","Ceolwulf","Eadberht",
    "Aethelwald","Alhred","Aethelred I","Aelfwald I","Eardwulf","Eanred","George V","Edward VIII",
    "George VI","Elizabeth II"};
  private static Random r = new Random(123);
  
  //returns a random String from the above array. 
  private static String getRandomName(){
    int index = r.nextInt(namesForSheep.length);
    return namesForSheep[index];
  }
  //returns a random age for a sheep from 1 to 10
  private static int getRandomAge(){
    return r.nextInt(10)+1;
  }
  //End of provided name/age generation code. 
  
  public static void main(String[] args){
    //Student Name: Max Weinberg
    //Student Number: 260500729
    //Your code goes here. 
    
    //Beginning of Scanner.
    Scanner sc = new Scanner(System.in);   
    
    System.out.println("What is the name of your farm? ");
    String nameOfFarm = sc.nextLine();
    
    System.out.println("What is the name of you dog? ");
    String nameOfDog = sc.nextLine();
    
    System.out.println("What kind of dog is " + nameOfDog + " ? ");
    String kindOfDog = sc.nextLine();
    
    //constructing the dog:
    Dog d1 = new Dog(nameOfDog, kindOfDog);
    
    System.out.println("And how many sheep do you have? ");
    int numberOfSheep = sc.nextInt();    
    
    //if statement to make sure dog can herd all the sheep:
    if(numberOfSheep > d1.herd()){
    	sc.close();
    	throw new IllegalArgumentException("Maximum number of sheep for this dog is " + d1.herd() + ". Recieved " + numberOfSheep + " sheep.");
    }
    
    System.out.println("The farm has " + numberOfSheep + " sheep.");
    System.out.println("Farm: " + nameOfFarm + "   Dog: " + nameOfDog);
    
    Sheep[] arrayOfSheep = new Sheep[numberOfSheep];
    //declaration of variable first, because I cannot declare and increment in the same statement. 
    double poundsOfWool = 0;
    
    	for(int i = 0; i<arrayOfSheep.length; i++){
    		arrayOfSheep[i] = new Sheep(getRandomName(), getRandomAge());
    		String nameOfSheep = arrayOfSheep[i].getName(); 
    		int ageOfSheep = arrayOfSheep[i].getAge();
    		poundsOfWool += arrayOfSheep[i].shear();
    		System.out.println(nameOfSheep + " is " + ageOfSheep + " years old." );
    		//to print total wool at the end, will use an if statement rather than another for loop
    		if(i == arrayOfSheep.length-1){
    			System.out.println("We just sheared " + poundsOfWool + " lbs of wool for a value of $" + (poundsOfWool * 1.45));
    		}
    	}   	
    sc.close();
  }
}
