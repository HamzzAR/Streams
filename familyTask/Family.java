import java.util.ArrayList;


public class Family {

	static ArrayList<Person> people = new ArrayList<Person>();

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
		if(findPerson(childName).getName().equals("notFound")){
			System.out.println(childName + " child added");
			people.add(child);
		}
		if(findPerson(parentName).getName().equals("notFound")){
			Person parent = new Person(parentName); 
			System.out.println(parentName + " parent added");
			people.add(parent);
			parent.setChildren(child);
			
		}else{
			findPerson(parentName).setChildren(child);
		}
		
		return false;
	}
	
	public Person findPerson(String name) {
		Person person = new Person("notFound");
		for (Person p : people) {
			if(p.getName().equals(name)){
				person = p;
				break;
			}
		}
		
		return person;
	}
	
}
