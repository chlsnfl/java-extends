package ex01;

public class CarExam {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i = 1; i<=5; i++) {
			int problemlocation = car.run();
			if(problemlocation != 0) {
				System.out.println(car.tires[problemlocation-1].location+" HanKookTire로 교체");
				car.tires[problemlocation-1] =new HankookTire(car.tires[problemlocation-1].location, 15);
			}
		}
//		for(int i = 1; i<=6; i++) {
//			int problemlocation = car.run();
//			switch(problemlocation) {
//			case 1:
//				System.out.println("앞왼쪽 HanKookTire로 교체");
//				car.frontLeftTire = new HankookTire("앞왼쪽", 10);
//				break;
//			case 2:
//				System.out.println("앞왼쪽 HanKookTire로 교체");
//				car.frontRightTire = new KumhoTire("앞왼쪽", 10);
//				break;
//			case 3:
//				System.out.println("앞왼쪽 HanKookTire로 교체");
//				car.backLeftTire = new HankookTire("앞왼쪽", 10);
//				break;
//			case 4:
//				System.out.println("앞왼쪽 HanKookTire로 교체");
//				car.backLeftTire = new KumhoTire("앞왼쪽", 10);
//				break;
//			}
			
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
		
	}

}
