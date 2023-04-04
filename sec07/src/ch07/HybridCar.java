package ch07;

public class HybridCar extends Car {
	int electricity;

	public int getElectricity() {
		return electricity;
	}

	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}
	
	//car 재정의
	@Override
	public void displayInfo() {
		System.out.println("---------HybridCar 정보----------");
		System.out.println("speed : " + getSpeed());
		System.out.println("oil : " + getOil());
		System.out.println("electricty : " + electricity);
	}
}
