package ex05;

public class PersonExam {

	public static void main(String[] args) {
		
		Person p = new Person();
		Employee e = new Employee();
		Manage m = new Manage();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();
	}

}
