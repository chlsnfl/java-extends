package test;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
	static Scanner sc = new Scanner(System.in);
	
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.println("다시 하시겠습니까? <Y => 1 or N => 0 >");
			cont=sc.nextInt();
		}while(cont !=0 && cont !=1);
		return cont == 1;
	}
	
	public static void main(String[] args) {

		Random rand = new Random();
		System.out.println("암산 훈련");
		do{
			
			int x = rand.nextInt(900)+100;  //3자리 수
			int y = rand.nextInt(900)+100;  //3자리 수
			int z = rand.nextInt(900)+100;  //3자리 수
			int pattern = rand.nextInt(4);  //패턴번호

			int answer;   //정답
			switch(pattern) {
			case 0: answer = x+y+z; break;
			case 1: answer = x+y-z; break;
			case 2: answer = x-y+z; break;
			default: answer = x-y-z; break;
			}
			while(true) {
				System.out.println(
						x+
						((pattern<2)? "+" : "-") +
						y+
						((pattern %2==0)? "+" : "-") + 
						z + "="
						);
				int k = sc.nextInt();   //입력한 답을 받음
				if(k==answer) {
					System.out.println("정답입니다.");
					break;
				}else {
					System.out.println("틀렸습니다.");
				}
			}
		}while(confirmRetry());
	}

}
