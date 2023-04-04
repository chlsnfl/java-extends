package ex01;

public class KumhoTire extends Tire{
	
		public KumhoTire(String location, int maxRotatioin) {
			super(location, maxRotatioin);
		}

		//메소드
		@Override
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
