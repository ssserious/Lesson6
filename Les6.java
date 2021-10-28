/**
* Java 1. Lesson 6
*@author Sergey Sergeev
*@version 28.10.2021
*/

public class Les6    {

    public static void main(String[] args) {
        Cat cat = new Cat("Швепс");
        Dog dog = new Dog("Хатико");
 
        System.out.println(cat);
        System.out.println(dog);
        System.out.println();
        dog.doRun(-10);
        dog.doRun(0);
        dog.doRun(150);
        dog.doSwim(10);
        cat.doRun(199);
        cat.doSwim(50);
        System.out.println();
	}
}
  
abstract class Animals implements AnimalsAction {
    privat String name;
    privat int Run;
    privat int Swim;
    privat String voice;
    static int animalsCount = 0;
    
    Animals(String name, String voice, int Run, int Swim) {
        this.name = name;
        this.voice = voice;
        this.Run = Run;
        this.Swim = Swim;
        animalsCount++;
    }

    public String getVoice() {
        return voice;
    }

    @Override
    public String Run(int distance) {
        if (distance < = 0) {
            return;
        } else if (Run == 0) { 
		System.out.println(""+ name +"");
        } else if (distance > Run)  {
            System.out.println(""+ name + Run + "");
        } else { 
            System.out.println("" + name + "" + distance + "");
        }
    }

    @Override
    public String Swim(int distance) {               
        if (distance < = 0) { 
            return;
        } else if (Swim == 0) { 
            System.out.println(""+ name +"");
        } else if (distance > Swim) {
            System.out.println(""+ name "" + Swim + ""); 
        } else { 
            System.out.println("" + name + "" + distance + "");
        }
	}
}
    
class Cat extends Animals {

    Cat(String name) {
        super(name, "", 200, 0);
    }

    @Override
    public String toString() {
        return "" + name + ""
                + "" + Run + ""
                + ""
                + "" + voice + "";
    }
}

class Dog extends Animals {

    Dog(String name) {
        super(name, "", 500, 10);
    }

    @Override
    public String toString() {
        return "" + name + ""
                + "" + Run + ""
                + "" + Swim + ""
                + "" + voice + "";
	}
}
    
interface AnimalsAction {
    void doRun(int distance);
    void doSwim(int distance);
    String getVoice();
}