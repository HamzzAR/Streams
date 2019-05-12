import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class AlphabetPosition {

	public static void main(String[] args) {
		Family f  = new Family();

		f.setParent("dear", "tom");
		f.setParent("silly", "tom");
		f.setParent("billy", "tom");
		f.setParent("dom", "tom");
		f.setParent("hamza", "tom");
		f.setParent("dear", "tom");
		
//		for (Person p : f.people) {
//			ArrayList<Person> a = p.getChildren();
//			System.out.println("first");
//			for (Person person : a) {
//				System.out.println("second");
//				System.out.println(person.getName());
//			}
//		}
		System.out.println(f.people.get(1).getName());
		ArrayList<Person> bb = f.people.get(1).getChildren();
		for (Person object : bb) {
			System.out.println(object.getName());
		}
	}
	
//	public AlphabetPosition() {
//		//replaceLetterWithPosition("This NETbuilder assessment is way too easy.");
//	}

}
