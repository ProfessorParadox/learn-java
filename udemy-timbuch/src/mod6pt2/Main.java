package mod6pt2;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1);
		
		//dog.eat();
		//dog.walk();
		//dog.run();
		//dog class doesnt have eat() but still we can use eat()
		//definition available in animal class
		
		//afterwards when we override eat() by giving definition 
		//of dog.eat() and called dog.chew() it shows
		//also we call super.eat() inside dog.eat() which
		//result in calling animal.eat()
		
		//fish class
		Fish fish = new Fish("gold",4,10,1,2,4);
		fish.swim(0);

	}

}
