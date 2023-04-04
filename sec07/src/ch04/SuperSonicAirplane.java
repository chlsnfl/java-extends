package ch04;

public class SuperSonicAirplane extends Airplan{
	
	//상수 static final - 는 정적 파이널로 선언함.
	public static final int NORMAL =1; //static final은 대문자 사용함
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	

	//부모의 메소드 fly()를 오버라이드해서 바꿈
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 합니다.");
		}else {
			//오버라이드 하기 전의 부모의 fly()를 실행시킴
			super.fly();
		}

	}
}
