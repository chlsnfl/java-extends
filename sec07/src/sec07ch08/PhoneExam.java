package sec07ch08;

public class PhoneExam {

	public static void main(String[] args) {
		// Galaxyphone 객체 생성
		GalaxyPhone galaxyphone = new GalaxyPhone("S22울트라", "핑크", true);
		
		//cellphone에서 상속받은 필드
		System.out.println("모델 : " + galaxyphone.model);
		System.out.println("컬러 : " + galaxyphone.color);
	
		//cellphone 에서 상속받은 메소드
		galaxyphone.porwerOn();
		galaxyphone.bell();
		galaxyphone.sendVoice("여보세요?");
		galaxyphone.receviveVoice("안녕하세요~ 저는 홍길동입니다! 나라를 훔치려고 해용~");
		galaxyphone.sendVoice("헛소리 하지 말고 끊으세요.");
		galaxyphone.hangUp();
		
		//galaxyphone필드 pen이 true이면 galaxyphone 메소드 호출
		if(galaxyphone.pen) {
			galaxyphone.turnonPen();
			galaxyphone.darwPen();
			galaxyphone.turnoffPen();
		}
	}

}
