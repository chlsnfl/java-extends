package sec07ch08;

public class OfficeExam {

	public static void main(String[] args) {

		Emplyee im = new Emplyee();
		im.setName("임꺽정");
		im.setJobTitle("대리");
		
		System.out.println(im.toString());
		
		System.out.println("---------------------");
		
		Manager2 mn = new Manager2();
		mn.setName("홍길동");
		mn.setJobTitle("과장");
		mn.setManageJob("인사과");
		
		System.out.println(mn.toString());
	}

}
