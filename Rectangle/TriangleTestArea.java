import junit.framework.TestCase;

public class TriangleTestArea extends TestCase {

	public void testAreaPositive() {
		//fail("Not yet implemented");
		Triangle T1 = new Triangle ();
		T1.setA(2);
		T1.setB(3);
		T1.setC(4);
		T1.setH(5);
		
		float Q = T1.area();
		System.out.println(Q);
		assertEquals((float)7.5,Q);
		
	}
	public void testAreaNegative() {
		//fail("Not yet implemented");
		Triangle T1 = new Triangle ();
		T1.setA(2);
		T1.setB(4);
		T1.setC(4);
		T1.setH(5);
		
		float Q = T1.area();
		System.out.println(Q);
		assertEquals((float)5,Q);
	

}
}
