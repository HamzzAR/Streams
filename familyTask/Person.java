import java.util.ArrayList;


public class Person {
	ArrayList<Person> children;
	Person father;
	Person mother;
	
	String gender;
	String name;

	public Person(String n) {
		children = new ArrayList<Person>();
		name = n;
		gender = "";
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void setChildren(Person child) {
		this.children.add(child);
	}
	
	public void setFather(Person father) {
		this.father = father;
	}
	
	public void setMother(Person mother) {
		this.mother = mother;
	}


}
