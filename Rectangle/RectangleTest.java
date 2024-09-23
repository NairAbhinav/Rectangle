import junit.framework.TestCase;

public class RectangleTest extends TestCase {
	
	public void testareapositive1()
	{
		NewRectangle R = new NewRectangle ();
		R.setLength(2);
		R.setBreadth(5);
		float A = R.area();
		assertEquals((float)10,A);

	}
	
	public void testareapositive2()
	{
		NewRectangle R = new NewRectangle ();
		R.setLength(6);
		R.setBreadth(6);
		float A = R.area();
		assertEquals((float)36,A);

	}
	
	public void testareanegative1()
	{
		NewRectangle R = new NewRectangle ();
		R.setLength(2);
		R.setBreadth(5);
		float A = R.area();
		assertEquals((float)12,A);

	}
	
	public void testareanegative2()
	{
		NewRectangle R = new NewRectangle ();
		R.setLength(2);
		R.setBreadth(4);
		float A = R.area();
		assertEquals((float)10,A);

	}

}
