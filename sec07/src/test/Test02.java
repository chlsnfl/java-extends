package test;
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("a번쨰에 들어올 숫자를 입력하세용");
		int a = sc.nextInt();
		System.out.println("b번쨰에 들어올 숫자를 입력하세용");
		int b = sc.nextInt();
		System.out.println("c번쨰에 들어올 숫자를 입력하세용");
		int c = sc.nextInt();
		

		
		if(a<b && a<c) {
			System.out.println("a가 제일 작아용");
		}else if(b<a && b<c) {
			System.out.println("b가 제일 작아용");
		}else if(c<a && c<b) {
			System.out.println("c가 제일 작아용");
		}
	}

}
