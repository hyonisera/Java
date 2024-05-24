package Chap08;

public class Polumorphism02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Animal();
		Pig myPig = new Pig();
		Dog myDog = new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}

}
