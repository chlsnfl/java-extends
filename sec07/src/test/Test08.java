package test;
import java.util.*;
import java.util.Random;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("난수를 생성");
		System.out.println("하한값 : ");
		int min = sc.nextInt();
		System.out.println("상한값 : ");
		int max = sc.nextInt();
		
		System.out.println("생성된 난수 : " + random(min, max));
	}
		//a 이상 b 이하인 난수를 생성
		static int random(int a, int b) {
			if(b <= a) {
				return a;
			}else {
				Random rd = new Random();
				return a+rd.nextInt(b-a+1);
			
		}

	}

}
