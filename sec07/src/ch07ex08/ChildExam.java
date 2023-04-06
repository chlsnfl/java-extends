package ch07ex08;

public class ChildExam {

	public static void methodA(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("methodA - Child 로 변환 성공");
			child.field2 = "data";
			child.method1();
			child.method2();
			child.method3();
		}else {
			System.out.println("타입 변환이 불가능 합니다.");
		}
		
	}
	public static void methodB(Parent parent) {
		Child child = (Child) parent;
		System.out.println("methodB - Child 로 변환 성공");
	}
	
	
	public static void main(String[] args) {
		
		Parent parent = new Child();
		methodA(parent);
		methodB(parent);

		Parent parent1 = new Parent();
		methodA(parent1);
		//methodB(parent2);  //에러 classcastexception 발생
		
		
		/*
		parent.field2 = "data"
	*/
		if(parent instanceof Child) {
		Child child = (Child)parent;  //(Child)강제 타입변환
		child.field2 = "data";
		child.method1();
		child.method2();
		child.method3();
		
		}else {
			System.out.println("자식타입으로 변환이 불가합니다");
		}
	}

}
