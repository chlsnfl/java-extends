package test;
import java.util.*;
public class Test03_teacher {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하세용");
		int a = sc.nextInt();
		System.out.println("b를 입력하세용");
		int b = sc.nextInt();
		System.out.println("c를 입력하세용");
		int c = sc.nextInt();
		
		System.out.println("최소값은 :" + a+","+b+","+c+ "의 중간값은 " + mid(a,b,c)+"입니당");

	}
	static int mid(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}else if(a<=c) {
				return a;
			}else {
				return c;
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}

}
