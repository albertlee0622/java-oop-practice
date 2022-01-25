package obj.inherit.basic;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("Animal is moving");
	}
}

class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("Human is moving on 2 legs");
	}
	
	public void readBook() {
		System.out.println("Human is reading a book");
	}
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("Tiger is moving on 4 legs");
	}
	
	public void hunt() {
		System.out.println("Tiger is hunting");
	}
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("Eagle is moving in the sky");
	}
	
	public void fly() {
		System.out.println("Eagle is flapping the wings");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal h = new Human(); //up-casting
		Animal t = new Tiger();
		Animal e = new Eagle();
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(h);
		animalList.add(t);
		animalList.add(e);
		
		AnimalTest test = new AnimalTest();
		
		for(Animal a : animalList) {
			test.moveAnimal(a);
		}
		
//		Eagle ee = (Eagle) e; //down-casting
//		ee.fly();
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}

