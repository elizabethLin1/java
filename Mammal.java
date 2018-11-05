//Elizabeth Lin 
//BUILD A ZOO
//May 25 2018


//subclass of Animal
public class Mammal extends Animal {
	//property
	String type;
	
	//constructor
	public Mammal() {
		type = " generic Mammal";
	}
	//constructor2 with type
	public Mammal(String NewType) {
		type = NewType;	
	}
	
	//constructor 3 with specified properties
	public Mammal(String newType,String newIDTag, String newColor, String newHabitat) {
		type = newType;
		setIDTag(newIDTag);
		setColor(newColor);
		setHabitat(newHabitat);
		
	}
	
	// getter
	public String getType(){
		return type;
		
	}
	//setter
	public void setType(String NewType) {
		type = NewType;
	}
	//method for printing 
	public void printMammal() {
	//print this + toString in Animal
		System.out.print("This is a " + type + ". ");
		System.out.println(toString());
		}
	
	
	
}
