
public class Runner {

	public static void main(String[] args) {
		Family f  = new Family();

		System.out.println(f.setParent("Vera", "George"));
		System.out.println(f.setParent("Vera", "Vanessa"));
		System.out.println(f.female("Vanessa"));
		System.out.println(f.female("George")); 
		System.out.println(f.isMale("George")); 
		
//		f.setParent("billy", "tom");
//		f.setParent("dom", "tom");
//		f.setParent("hamza", "tom");
		
//		System.out.println(f.people.get(1).getName());
//		ArrayList<Person> bb = f.people.get(1).getChildren();
//		for (Person object : bb) {
//			System.out.println(object.getName());
//		}

	}

}
