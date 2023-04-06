package ch07ex08;

public class Cat extends Animal{
	public Cat() {
		this.kind = "고양이과 포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("냥냥");
	}
}
