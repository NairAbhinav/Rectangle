import junit.framework.TestCase;

public class TriangleTestPerimeter extends TestCase {
	
	public void testPerimeterPositive() {
		//fail("Not yet implemented");
		Triangle T2 = new Triangle ();
		T2.setA(2);
		T2.setB(3);
		T2.setC(4);
		T2.setH(5);
		
		float X = T2.perimeter();
		System.out.println(X);
		assertEquals((float)9.0,X);
		
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
