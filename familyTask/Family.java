import java.util.ArrayList;


public class Family {

	static ArrayList<Person> people = new ArrayList<Person>();

	public boolean male(String name) {
		boolean res = false;
		Person person = findPerson(name);
		if(!person.getName().equals("notFound")){
			ArrayList<Person> children = person.getChildren();
			
			//children.stream().filter(child -> !child.hasFather());

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
		Person foundChild = findPerson(childName);
		if(foundChild.getName().equals("notFound")){
			people.add(child);
		}
		
		Person parent = new Person(parentName); 
		Person foundParent = findPerson(parentName);
			
		if(foundParent.getName().equals("notFound")){
			people.add(parent);
			if(foundChild.getName().equals("notFound")){
				parent.setChildren(child);
			}else{
				parent.setChildren(foundChild);
			}
			
			if(foundChild.getName().equals("notFound")){
				if(child.getParent().size() < 3){
					child.setParent(parent);
				}
			}else{
				foundChild.setParent(parent);
			}
			
			done = true;
		}else{
			if(foundChild.getName().equals("notFound")){
				foundParent.setChildren(child);
		
				if(child.getParent().size() < 3){
					child.setParent(foundParent);
				}
				done = true;
			}else{
				if(childsChildrenHasParent(foundChild, foundParent) == false && parentParentsHaveChild(foundChild, foundParent) == false){
					foundParent.setChildren(foundChild);
					foundChild.setParent(foundParent);
					done = true;
				}
			}
			
		}

		return done;
	}
	
	public boolean childsChildrenHasParent(Person child, Person parent) {
		boolean res = false;
		ArrayList<Person> children = child.getChildren();
		for (Person p : children) {
			if(p.getName().equals(parent.getName())){
				res = true;
				break;
			}else{
				res = false;
			}
		}
		
		return res;
	}
	
	public boolean parentParentsHaveChild(Person child, Person parent) {
		boolean res = false;
		ArrayList<Person> parents = parent.getParent();
		for (Person p : parents) {
			if(p.getName().equals(child.getName())){
				res = true;
				break;
			}else{
				res = false;
			}
		}
		
		return res;
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
	
	public String getParents(String name) {
		StringBuilder res = new StringBuilder();
		res.append("[");
		Person person = findPerson(name);
		
		if(!person.getName().equals("notfound")){
			ArrayList<Person> parents = person.getParent();
			parents.stream()
			.forEach(p -> res.append(p.getName()+","));
		}
		
		res.append("]");
		return res.toString();
	}
	
	public String getChildren(String name) {
		StringBuilder res = new StringBuilder();
		res.append("[");
		Person person = findPerson(name);
		if(!person.getName().equals("notfound")){
			ArrayList<Person> children = person.getChildren();
			children.stream()
			.forEach(p -> res.append(p.getName()+","));
		}
		
		res.append("]");
		return res.toString();
	}
	
}
