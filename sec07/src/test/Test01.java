package test;
import java.util.Scanner;
public class Test01 {

	static int signOf(int n) {
		int sign = 0;
		if(n>0) {
			sign = 1;
		}else if(n<0) {
			sign = -1;
		}
		return sign;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세용");
		int x = sc.nextInt();
		
		int s = signOf(x);
		System.out.println("실행결과는 : "+s+" 입니다.");
	}

}
