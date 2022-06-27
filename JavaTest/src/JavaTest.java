import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setName("Paulo");
		System.out.println(person1.getName());
		

		Person person2 = new Person("Paul", 27, "Male", "Filipino", 2014);
		System.out.println(person2.getName());
	}

}
