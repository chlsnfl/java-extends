package ex02;

public class DriveExam {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Texi taxi = new Texi();
		
		driver.drive(taxi);
		driver.drive(bus);
	}

}
