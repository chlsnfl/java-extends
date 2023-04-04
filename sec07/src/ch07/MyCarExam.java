package ch07;

public class MyCarExam {

	public static void main(String[] args) {
		
		vehicle v = new vehicle();
		Car c = new Car();
		HybridCar h = new HybridCar();
		
		v.displayInfo();
		System.out.println();
		c.displayInfo();
		System.out.println();
		h.displayInfo();
		
		System.out.println();
		System.out.println();

		vehicle c1 = new Car(); //부모타입이라 가능합
		vehicle c2 = new HybridCar();
		Car c3 = new HybridCar();
		
		c1.displayInfo();
		System.out.println();
		c2.displayInfo();
		System.out.println();
		c3.displayInfo();
		
//		HybridCar c4 = new vihicle();  //자식객체라서 불가능함
		
	}

}
