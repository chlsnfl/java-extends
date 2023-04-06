package test;
import java.util.*;
public class Test04_teacher {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구할구얌");
		
		int x;
		do {
			System.out.println("n을 입력하세요 >");
			x=sc.nextInt();
		}while(x<=0);
		
		System.out.println("1부터 " + x +"까지의 더한 결과는 "+ sum(x)+"입니당");
	}

	static int sum(int n) {
		int sum = 0;  //합이 들어갈 변수
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
		

}
