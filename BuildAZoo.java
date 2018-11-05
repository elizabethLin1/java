//Elizabeth Lin 
//BUILD A ZOO
//May 25 2018

//create Animals and do method to them
public class BuildAZoo {
	//with main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///build a zoo named "L"
		Zoo L = new Zoo();
		
		//create birds with specified properties
		Bird robin = new Bird("robin", true, false,"ROBIN1", "brown and red","tree");
		//print individually
		robin.printBird();
		Bird flamingo = new Bird("flamingo", true, false,"FLAMINGO1", "pink","ponds");
		flamingo.printBird();
		Bird mallard = new Bird("mallard", true, true,"MALLARD1", "green and black","ponds");
		mallard.printBird();
		Bird penguin = new Bird("penguin", false, true,"PENGUIN1", "black and white","Antarctica");
		penguin.printBird();
		
		//create mammals
		Mammal ZEBRA1 = new Mammal("zebra", "ZERBRA1", "black and white", "Africa");
		//print
		ZEBRA1.printMammal();
		Mammal ZEBRA2 = new Mammal("zebra", "ZERBRA2", "black and white", "Africa");
		ZEBRA2.printMammal();
		Mammal lion = new Mammal("lion", "LION1", "tan", "Africa");
		lion.printMammal();
		Mammal tiger = new Mammal("tiger", "TIGER1", "orange and black", "jungle");
		tiger.printMammal();
		Mammal HORSE1 = new Mammal("horse", "HORSE1", "chestnut", "barn");
		HORSE1.printMammal();
		Mammal HORSE2 = new Mammal("horse", "HORSE2", "bay", "barn");
		HORSE2.printMammal();
		Mammal platyuss = new Mammal("platypuss", "PLATY1", "brown", "water");
		platyuss.printMammal();
		//make a space line
		System.out.println();
		
		//kill zebra2
		ZEBRA2.Dies();
		
		//add all the animals into the Zoo
		L.addAnimal(robin);
		L.addAnimal(flamingo);
		L.addAnimal(mallard);
		L.addAnimal(penguin);
		L.addAnimal(ZEBRA1);
		L.addAnimal(ZEBRA2);
		L.addAnimal(lion); 
		L.addAnimal(tiger);
		L.addAnimal(HORSE1);
		L.addAnimal(HORSE2);
		L.addAnimal(platyuss);
		System.out.println();
		
		//print all the info of the zoo
		//zebra cannot be added because it died. 
		L.printAllAnimals();
		System.out.println();
		
		//kil robin
		robin.Dies();
		
		//print
		//for robin, because it dead, so it shows robin died in the zoo
		L.printAllAnimals();
		System.out.println();
		
		//remove animal from the zoo
		//robin is because of dies
		L.removeAnimalWithIDTag(robin);
		//horse still alive, but only remove to other place. 
		L.removeAnimalWithIDTag(HORSE2);
		L.printAllAnimals();
		System.out.println();
		
		//final print
		L.printAllAnimals();
	}

}
