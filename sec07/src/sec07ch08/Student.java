package sec07ch08;

public class Student extends People{
	
	int num;

	public Student(String name, String ssn, int num) {
		super(name, ssn);
		this.num = num;
		System.out.println("학생 객체 생성 완료");

	}



	
}
