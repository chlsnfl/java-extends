package ch07;

public class vehicle {
	int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void displayInfo() {
		System.out.println("---------Vehicle 정보----------");
		System.out.println("speed : " + speed);
	}
}
