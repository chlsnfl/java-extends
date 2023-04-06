package test;
import java.util.*;
public class Test04 {

	public static int text(int n) {
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구할구얌. n을 입력하세용 >");
		int n = sc.nextInt();
		
		System.out.println(text(n));
	}
	
}
