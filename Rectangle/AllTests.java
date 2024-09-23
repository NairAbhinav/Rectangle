import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * regular
 * @author Abhinav R K
 * @param
 * @return
 * @since 14-09-2024
 * @version 1.0
 * @exception PersonNotFoundException gevonden
 */
public class AllTests {

	
	
	
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TriangleTestArea.class);
		suite.addTestSuite(TriangleTestPerimeter.class);
		//$JUnit-END$
		return suite;
	}

}
