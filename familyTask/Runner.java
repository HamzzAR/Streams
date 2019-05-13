import java.util.ArrayList;
import java.util.List;


public class Runner {

	public static void main(String[] args) {
		Family fam  = new Family();

		System.out.println(fam.setParent("Frank", "Morgan"));       // true
		System.out.println(fam.setParent("Frank", "Dylan"));        // true
		System.out.println(fam.male("Dylan"));                        // true
		System.out.println(fam.setParent("Joy", "Frank"));          // true
		System.out.println(fam.male("Frank"));                        // true
		System.out.println(fam.male("Morgan"));                       // false
		// (Morgan is a woman because she both is Frank's parent, but not his father) 
		System.out.println(fam.setParent("July", "Morgan"));        // true
		// (The preceding assertion was rejected, so there is no conflict)
		System.out.println(fam.isMale("Joy"));
		System.out.println(fam.isFemale("Joy")); // false
		// (We know Joy is Frank's child, but we can't derive Joy's gender)
		System.out.println(fam.getChildren("Morgan"));              // ["Frank", "July"]
		System.out.println(fam.setParent("Jennifer", "Morgan"));    // true
		System.out.println(fam.getChildren("Morgan"));              // ["Frank", "Jennifer", "July"]
		System.out.println(fam.getChildren("Dylan"));               // ["Frank"]
		// (That is all we know for sure)
		System.out.println(fam.getParents("Frank"));                // ["Dylan", "Morgan"]
		System.out.println(fam.setParent("Morgan", "Frank"));       // false
		// (It is impossible to be the parent of your parent)
		
		
		
	
		

	}
	
	

}
