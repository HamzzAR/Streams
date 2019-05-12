import java.util.ArrayList;


public class Family {

	static ArrayList<Person> people = new ArrayList<Person>();

	public boolean male(String name) {
		boolean res = false;
		Person person = findPerson(name);
		if(!person.getName().equals("notFound")){
			ArrayList<Person> children = person.getChildren();
			for (Person child : children) {
				if(!child.hasFather()){
					child.setFather(person);
					person.setGender("male");
					res = true;
					ArrayList<Person> cParents = child.getParent();
					for (Person ps : cParents) {
						if(!ps.getName().equals(name)){
							child.setMother(ps);
							ps.setGender("female");
						}
					}
				}else{
					res = false;
				}
			}
		}
		return res;
	}
	
	public boolean female(String name) {
		boolean res = false;
		Person person = findPerson(name);
		if(!person.getName().equals("notFound")){
			ArrayList<Person> children = person.getChildren();
			for (Person child : children) {
				if(!child.hasMother()){
					child.setMother(person);
					person.setGender("female");
					res = true;
					ArrayList<Person> cParents = child.getParent();
					for (Person ps : cParents) {
						if(!ps.getName().equals(name)){
							child.setFather(ps);
							ps.setGender("male");
						}
					}
				}else{
					res = false;
				}
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
		boolean done = false;
		Person child = new Person(childName);
		if(findPerson(childName).getName().equals("notFound")){
			System.out.println(childName + " child added");
			people.add(child);
		}
		
		Person parent;
		if(findPerson(parentName).getName().equals("notFound")){
			parent = new Person(parentName); 
			System.out.println(parentName + " parent added");
			people.add(parent);
			parent.setChildren(child);
			done = true;
		}else{
			parent = findPerson(parentName);
			parent.setChildren(child);
			done = true;
		}
		
		if(child.getParent().size() < 2){
			child.setParent(parent);
		}
		
		return done;
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
