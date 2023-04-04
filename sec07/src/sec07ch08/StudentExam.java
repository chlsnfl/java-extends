package sec07ch08;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sd = new Student("홍길동", "1234567-123456",15);

		
		System.out.println("이름 : " + sd.name);
		System.out.println("주민번호 : "+ sd.ssn);
		System.out.println("학생번호 : "+sd.num);
	}

}
