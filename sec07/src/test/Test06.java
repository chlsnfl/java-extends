package test;
import java.util.*;
public class Test06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.println("몇 월입니까?");
			month = sc.nextInt();
		}while(month<1 || month>12);
		
		System.out.println("해당 월의 계절은? : " );
		printSeason(month);
	}
	
	static void printSeason(int m) {
		switch(m) {
		
		case 12:case 1:case 2: System.out.println("겨울입니댕"); break;
		case 3:case 4:case 5: System.out.println("봄입니댕"); break;
		case 6:case 7:case 8: System.out.println("여름입니댕"); break;
		case 9:case 10:case 11: System.out.println("가을입니댕"); break;
		
			}
		
		
	}
}
