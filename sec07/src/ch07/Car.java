package ch07;

public class Car extends vehicle{
	int oil;

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
	
	//Vehicle 재정의
	@Override
	public void displayInfo() {
		System.out.println("---------Car 정보----------");
		System.out.println("speed : " + getSpeed());
		System.out.println("oil : " + oil);
	}
}
