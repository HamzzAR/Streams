import java.util.ArrayList;
import java.util.HashMap;


public class Family {

	ArrayList<Person> people = new ArrayList<Person>();

	

	public boolean male(String name) {
		boolean res = false;
		for (Person m : people) {
			if(m.getName().equals(name)){
				m.setGender("male");
				res = true;
				break;
			}else{
				res = false;
			}
		}
		
		
		return res;
	}
	
	public boolean female(String name) {
		boolean res = false;
		for (Person m : people) {
			if(m.getName().equals(name)){
				m.setGender("female");
				res = true;
				break;
			}else{
				res = false;
			}
		}
		
		return res;
	}
	
	public boolean isMale(String name) {
		boolean res = false;
		for (Person m : people) {
			if(m.getName().equals(name)){
				if(!m.getGender().equals("") && m.getGender().equals("male")){
					res = true;
					break;
				}else{
					res = false;
					break;
				}
				
			}
		}
		
		return res;
	}
	
	public boolean isFemale(String name) {
		boolean res = false;
		for (Person m : people) {
			if(m.getName().equals(name)){
				if(!m.getGender().equals("") && m.getGender().equals("female")){
					res = true;
					break;
				}else{
					res = false;
					break;
				}
			}
		}
		return res;
	}
	
	public boolean setParent(String childName, String parentName){
		
		Person child = new Person(childName);
		Person parent = new Person(parentName);
		if(findPerson(childName) == false){
			people.add(child);
		}
		if(findPerson(parentName) == false){
			people.add(child);
		}
		
		people.add(parent);
		parent.setChildren(child);
		
		
		return false;
	}
	
	public boolean findPerson(String name) {
		boolean found = false;
		for (Person p : people) {
			if(p.getName().equals(name)){
				found = true;
				break;
			}else{
				found = false;
			}
		}
		
		return found;
	}
	
	public static void main(String[] args) {
	}

}
