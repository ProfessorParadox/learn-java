package mod6pt2;

public class Animal {
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
		
	public Animal(String name, int brain, int body, int size, int weight) {
		super();
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	
	public Animal() {
		this("default name",0,0,0,0);
	}
	
	public void eat() {
		System.out.println("Animal.eat() was called.");
		
	}
	
	public void move(int speed) {
		System.out.println("Animal.move() was called.");
		System.out.println("animal is moving at speed= " + speed);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBrain() {
		return brain;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
}
