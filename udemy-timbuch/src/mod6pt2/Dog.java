package mod6pt2;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	
	/*
	//this is auto generated cons from superclass animal
	public Dog(String name, int brain, int body, int size, int weight) {
		super(name, brain, body, size, weight);
		
	}*/
	//we can remove some parameters from dog cons like body brain
	//and pass on hardcoded value of 1,1 in their place to 
	//the superclass animal using super()
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;		
	}
	
	private void chew() {
		System.out.println("Dog.chew() was called.");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() was called.");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called.");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called.");
		move(10);
	}
	
	private void moveLegs(int speed) {
		System.out.println("dog.moveLegs() called.");
	}

	@Override
	public void move(int speed) {
		System.out.println("dog.move() called.");
		moveLegs(speed);
		super.move(speed);
	}
		
	
}
