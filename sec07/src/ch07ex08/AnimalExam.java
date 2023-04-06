package ch07ex08;

public class AnimalExam {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println();
		
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();

		animal = new Cat();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		
	}
}

//자식 class는 부모 class를 선택 할 수 있지만 부모 class 자식 class를 선택할 수 있다.