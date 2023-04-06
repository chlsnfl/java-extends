package test;

import java.util.Scanner;

public class Test09 {
	
	static Scanner sc = new Scanner(System.in);   //안, 밖 모두 쓰려고 밖에다 생성함
	
	public static void main(String[] args) {
		int x;

			int n = readPlusInt();
			System.out.println("반대로 읽으5면 ");
			
			while(n>0) {
				System.out.print(n%10);  //n의 마지막 자릿수
				n /=10;
			}
			System.out.println("입니다.");

	}
	
	//양의 정수값을 읽어서 반환
	static int readPlusInt() {
		int x;
		do {
			System.out.println("양의 정수값");
			x=sc.nextInt();
		}while(x<=0);
		return x;
	}

}
