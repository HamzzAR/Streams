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

	
	public static void main(String[] args) {
		new Family();
	}

}
