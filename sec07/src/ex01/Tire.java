package ex01;

public class Tire {
	//필드 
	public int maxRotation;//타이어 최대 회전 수 (최대수명)
	public int accumulateRotation; //누적회전수
	public String location;//타이어의 위치
	
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location= location;

	}
	
	
	//메소드
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "한국 타이어 수명" + (maxRotation -  accumulateRotation)+ "회");
			return true;
		}else {
			System.out.println("***" + location + "한국 타이어가 펑크났습니다. ****");
		return false;
		}
	}
}
