package test;
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a번쨰에 들어올 숫자를 입력하세용");
		int a = sc.nextInt();
		System.out.println("b번쨰에 들어올 숫자를 입력하세용");
		int b = sc.nextInt();
		System.out.println("c번쨰에 들어올 숫자를 입력하세용");
		int c = sc.nextInt();
		
		if(a<b && a>c) {
			System.out.println("a가 중간이네용");
		}else if(b<a && b>c) {
			System.out.println("b가 중간이네용");
		}else if(c<a && c>b && a>b) {
			System.out.println("c가 중간이네용");
		}
	}

}
