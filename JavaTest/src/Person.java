
public class Person {
	
	private String name = "";
	private int age = 0;
	private String gender = "";
	private String nationality = "";
	private int id = 0;
	
	public Person() {
		
	}
	public Person(String name, int age, String gender,String nationality,int id) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.nationality = nationality;
		this.id = id;
		
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public void setGender(String gender) {

		this.gender = gender;
	}

	public void setNationality(String nationality) {

		this.nationality = nationality;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {

		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getNationality() {
		return this.nationality;
	}
	
	public static int getId() {
		return 27;
	}

}
