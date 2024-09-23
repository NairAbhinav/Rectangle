import junit.framework.TestCase;

public class RectangleTest2 extends TestCase {

	//public void testPerimeter() {
		//fail("Not yet implemented");
		public void testperipositive1()
		{
			NewRectangle R1 = new NewRectangle ();
			R1.setLength(2);
			R1.setBreadth(5);
			float P = R1.perimeter();
			assertEquals((float)14,P);

		}
		
		public void testperipositive2()
		{
			NewRectangle R1 = new NewRectangle ();
			R1.setLength(6);
			R1.setBreadth(6);
			float P = R1.perimeter();
			assertEquals((float)24,P);

		}
		
		public void testperinegative1()
		{
			NewRectangle R1 = new NewRectangle ();
			R1.setLength(2);
			R1.setBreadth(5);
			float P = R1.perimeter();
			assertEquals((float)12,P);

		}
		
		public void testperinegative2()
		{
			NewRectangle R1 = new NewRectangle ();
			R1.setLength(2);
			R1.setBreadth(4);
			float P = R1.perimeter();
			assertEquals((float)10,P);
		}


}
