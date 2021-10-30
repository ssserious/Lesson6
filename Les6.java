/**
* Java 1. Lesson 6
*@author Sergey Sergeev
*@version 28.10.2021
*/

public class Les6    {

    public static void main(String[] args) {
        Cat cat = new Cat(100);
        Dog dog = new Dog(333,33);
 
        AnimalJ[] animals = {cat, dog};
		for (AnimalJ animal : animals) {
            System.out.println(animal);
            System.out.println(200);
            System.out.println(500);
            System.out.println(2);
            System.out.println(20);
        }
        System.out.println("animal created" + Animal.getCountAnimals());
	}
}
    
class Dog extends Animal {

    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Cat extends Animal {
	
	Cat(int runLimit, int swimLimit) {
		super(runLimit, swimLimit);
	}
	
	Cat(int runLimit) {
		super(runLimit, -2);
	}
	
	public String swim(int distance) {
		return getClassName() + "swim";
	}
}

abstract class Animal implements AnimalJ {
    private int runLimit;
    private int swimLimit;
	private String className;
    private static int animalCount = 0;
    
    Animal(int runLimit, int swinLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
		className = getClass().getName();
        animalCount++;
    }

    public String getClassName() {
		return className;
	}
	
	public static int getCountAnimals() {
		return animalCount;
	}
	
	@Override
    public String Run(int distance) {
        if (distance > runLimit) {
            return className + "run" + distance;
        } else { 
            return className + "run" + distance;
		}
	}
			
    @Override
    public String Swim(int distance) {               
        if (distance > swimLimit) { 
            return className + "swim" + distance;
        } else { 
            return className + "swim" + distance;
        }
	}
	
	@Override
    public String toString() {
        return className + "rLimit" + runLimit + "sLimit" +swimLimit;  
	}
}	
	
interface AnimalJ {
    String Run(int distance);
    String Swim(int distance);
}