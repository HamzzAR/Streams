import java.util.ArrayList;
import java.util.HashMap;


public class Family {

	ArrayList<People> people = new ArrayList<People>();

	HashMap<Object, Object> relationships = new HashMap<Object, Object>();
	

	public boolean male(String name) {
		boolean res = false;
		for (People m : people) {
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
		for (People m : people) {
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
		for (People m : people) {
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
		for (People m : people) {
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
		boolean res = true;
		for (People m : people) {
			if(m.getName().equals(childName) || m.getName().equals(parentName)){
				res = false;
				break;
			}else{
				res = true;
			}
		}
		if(res == true){
			people.add(new People(childName));
			people.add(new People(parentName));
			relationships.put(childName, parentName);
		}
		
		return res;
	}
	
//	public List getChildren(String name) {
//		
//	}
	
	public static void main(String[] args) {
		Family fam = new Family();
		System.out.println(fam.setParent("Hamza", "ammi"));
		System.out.println(fam.setParent("Hamza", "Abdul"));
		System.out.println(fam.male("Hamza"));
		System.out.println(fam.female("ammi"));
		System.out.println(fam.isFemale("Hamza"));
		System.out.println(fam.isMale("Hamza"));
		System.out.println(fam.isMale("ammi"));
		System.out.println(fam.isFemale("ammi"));
	}

}
