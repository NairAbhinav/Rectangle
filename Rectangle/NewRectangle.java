/**
	 * regular
	 * @author Abhinav R K
	 * @description - initialization of parameter.
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFoundException gevonden
	 */
public class NewRectangle {
	float length,breadth,area,perimeter;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	
	/**
	 * regular
	 * @author Abhinav R K
	 * @param length and breadth
	 * @return area of type float
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFoundException gevonden
	 */
	public float area () 
	{
		
		return area = length * breadth;
		
	}
	
	public float perimeter () 
	{
		
		return perimeter =  2*(length + breadth);
		
	}


}
