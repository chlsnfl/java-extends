package sec07ch08;

public class GalaxyPhone extends Cellphone{
	
	//필드
	Boolean pen;
	
	//생성자
	GalaxyPhone(String model, String color, Boolean pen){
		this.model = model;
		this.color = color;
		this.pen = pen;
	}
	
	//메소드
	void turnonPen() {
		System.out.println("갤럭시 " + model + "의 펜을 꺼냅니다.");
	}
	
	void darwPen() {
		System.out.println("갤럭시 " + model + "에 그림을 그립니다.");
	}
	
	void turnoffPen() {
		System.out.println("그리기를 중단하고 팬을 " + model + "에 넣습니다.");
	}
	
}
