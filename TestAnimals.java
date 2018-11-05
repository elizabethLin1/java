//Elizabeth Lin 
//BUILD A ZOO
//May 25 2018


//build this for check if the animal, birds, mamal works
public class TestAnimals {
	
	//has main 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set Animal for the constructor 1, the basic one
		Animal Gen_Animal = new Animal();
		//print
		System.out.println(Gen_Animal.toString());
		//same
		Animal Gen2 =  new Animal("Gen_Animal", "black", "forest", true);
		System.out.println(Gen2.toString());
		
		//set bird for theonstructor 1 
		Bird generic_bird = new Bird();
		generic_bird.printBird();
		Bird crow = new Bird("crow", true, true, "Crow1", "balck", "corn fields");
		crow.printBird();
		
		//for mammal
		Mammal Gen_M = new Mammal();
		Gen_M.printMammal();
		//only set the type, else are default
		Mammal cat = new Mammal("cat");
		cat.printMammal();
		Mammal tiger = new Mammal("tiger", "tiger1", "orange and balck","jungle");
		tiger.printMammal();
		
		
		
		
	}

}
