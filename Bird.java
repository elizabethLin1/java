//Elizabeth Lin 
//BUILD A ZOO
//May 25 2018

//extends in order that be the subclass of Animal(superclass)
//subclasses
public class Bird extends Animal {
	//properties
	String type;
	boolean flys;
	boolean swims;
	String answerF;
	String answerS;
	
	//Constructor1
	public Bird() {
		type = "generic bird";
		flys =  true;
		swims = false;
	}
	//consturctor2 with specified properties
	public Bird(String newType, boolean newFlys, boolean newSwims,String newIDTag, String newColor, String newHabitat) {
		type = newType;
		flys =  newFlys;
		swims = newSwims;
		setIDTag(newIDTag);
		setColor(newColor);
		setHabitat(newHabitat);
		
	}
	
	//setter and getter
	public String getType(){
		return type;
		
	}
	//setter
	public void setType(String NewType) {
		type = NewType;
	}
	//getter
	public boolean doflys() {
		return flys;	
	}
	//setter
	public void Noflys() {
		flys = false;
	}
	
	public boolean doswims() {
		return swims;
	}
	public void Noswims() {
		swims = false;
	}
	
	//methods to print 
	public void printBird() {
	//check if the bird fly
	if(flys  == true) {
		answerF = "flys";
	}
	else {
		answerF = "does not fly";
	}
	if(swims  == true) {
		answerS = "swims";
	}
	else {
		answerS = "does not swims";
	}
	//print this + toString in Animal
	System.out.print("This bird is a " + type + ". It " + answerF + " and it "+ answerS +". ");
	System.out.println(toString());
	}
		
}
