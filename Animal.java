//Elizabeth Lin 
//BUILD A ZOO
//May 25 2018


//superclass Animal
public class Animal {
	//properties
	String IDTag;
	String color;
	String habitat;
	boolean respiration;
	String answer;
	
	//consturctor1
	public Animal(){
		IDTag = "Gen_animal";
		color = "brown";
		habitat = "land";
		respiration = true;
		
	}
	//constructor2
	public Animal(String newIDTag, String newColor, String newHabitat, boolean IfRespiration) {
		IDTag = newIDTag;
		color = newColor;
		habitat = newHabitat;
		respiration= IfRespiration; 
	}
	
	//setter and gettter
	public String getIDTag() {
		return IDTag;
	}
	public void setIDTag(String newIDTag) {
		IDTag = newIDTag;
	}
	//getter
	public String getColor() {
		return color;
	}
	//setter
	public void setColor(String newColor) {
		color = newColor;
	}
	
	
	public void setHabitat(String newHabitat) {
		habitat = newHabitat;
	}
	public String getHabitat() {
		return habitat;
	}
	//getter
	public boolean isAlive() {
		return respiration;	
	}
	//setter
	public void Dies() {
		respiration = false;
	}

	//format the information for output
	public String toString() {
	//use if-else to check the respiration and output the right answer
	if(respiration  == true) {
		answer = "lives";
	}
	else {
		answer = "died";
	}		
	return "IDTag is " + IDTag + ". Its color is " + color + " and it "+ answer + " in " + habitat + ".";
	}
}


