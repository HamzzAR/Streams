import java.util.ArrayList;


public class Person {
	ArrayList<Person> children;
	ArrayList<Person> parent;
	
	Person father;
	Person mother;
	
	String gender;
	String name;

	public Person(String n) {
		children = new ArrayList<Person>();
		parent = new ArrayList<Person>();
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
	public ArrayList<Person> getChildren() {
		return children;
	}
	
	public ArrayList<Person> getParent() {
		return parent;
	}
	public void setParent(Person parent) {
		this.parent.add(parent);
	}
	
	public boolean hasFather() {
		if (this.father == null){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean hasMother() {
		if (this.mother == null){
			return false;
		}else{
			return true;
		}
	}

}
