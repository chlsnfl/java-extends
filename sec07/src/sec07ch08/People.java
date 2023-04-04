package sec07ch08;

public class People {

//필드
	public String name;
	public String ssn;
	
	//메소드
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("학생 객체 생성 완료");
	}

}
