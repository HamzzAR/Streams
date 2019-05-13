import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class FamilyTest {
	Family fam = new Family();
	boolean res = fam.setParent("Frank", "Morgan"); 
	boolean res2 = fam.setParent("Frank", "Dylan");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test started");
	}
	
	@Test
	public void testSetParent() {
		assertTrue("Expected True:",res && res2);

	}

	@Test
	public void testMale() {
		boolean r = fam.male("Dylan");
		assertTrue("Expected True",r);
	}

	@Test
	public void testFemale() {
		boolean r = fam.female("Frank");
		assertTrue("Expected True",r);
	}

	@Test
	public void testIsMale() {
		boolean r = fam.isMale("Dylan");
		assertTrue("Expected True",r);
	}

	@Test
	public void testIsFemale() {
		boolean r = fam.isFemale("Morgan");
		assertTrue("Expected True",r);
	}

	@Test
	public void testGetParents() {
		String res = fam.getParents("Frank");
		if(!res.contains("Morgan") || !res.contains("Dylan")){
			fail("Does not return the correct parents");
		}
	}

	@Test
	public void testGetChildren() {
		String res = fam.getChildren("Morgan");
		if(!res.contains("Frank")){
			fail("Does not return the correct parents");
		}
	}

}
