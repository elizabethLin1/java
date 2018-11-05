//Elizabeth Lin 
//BUILD A ZOO
//May 25 2018

//import the hashmap
import java.util.HashMap;
//still subclass of Animal
public class Zoo extends Animal{
	//build a new Hashmap
	HashMap AnimalStore = new HashMap();
	
	//addAnimal Method,     newAnimal is the new name of Aniaml
	public boolean addAnimal(Animal newAnimal) {
		//check if the animal is alive, must use 'newAnimal.isAlive', need to specify check the animal in Hashmap
		if(newAnimal.isAlive()) {
			AnimalStore.put(newAnimal.IDTag,newAnimal);                 //put( key, object to Store), put is the method
			newAnimal.setHabitat("Zoo");									//change the animals' habitat in the Hashmap into ZOO
			//print 
			System.out.println(newAnimal.IDTag + " has Been added to the zoo.");
			//return
			return true;
		}
		else {
			System.out.println(newAnimal.IDTag + " is dead and connot be added to zoo");
			return false;
		}
		}
	
	//remove method, 	critter is the new name of Animal
	public boolean removeAnimalWithIDTag(Animal critter ) {
		if(AnimalStore.containsKey(critter.IDTag)) {					//before remove the animal,must check it the store has this animal
			AnimalStore.remove(critter.IDTag);
			System.out.println(critter.IDTag + " has left the zoo.");
			return true;
		}
		else {
			System.out.println(critter.IDTag + "is not in the zoo.");
			return false;
		}
		
	}
	
	//print all animals info method
	public void printAllAnimals() {
		Animal newAnimal;			//new name of Animal
		for(Object key : AnimalStore.keySet()) {				//use for each loop to print all the info, print each key in the Animal STORE 
			newAnimal = (Animal)AnimalStore.get(key);
			System.out.println(newAnimal.toString());
		}
		
	}
	}
        