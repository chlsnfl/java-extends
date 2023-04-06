package test;
import java.util.*;
public class Test02_teacher {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하세용");
		int a = sc.nextInt();
		System.out.println("b를 입력하세용");
		int b = sc.nextInt();
		System.out.println("c를 입력하세용");
		int c = sc.nextInt();
		
		System.out.println("최소값은 :" + a+","+b+","+c+ "의 최소값은 " + min(a,b,c)+"입니당");

	}
	static int min(int a, int b, int c) {
		int min=a;
		if(b<min) {
			min = b;
		}
		if(c<min) {
			min = c;
		}
		return min;
	}

}
