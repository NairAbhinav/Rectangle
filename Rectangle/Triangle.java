/**
	 * regular
	 * @author Abhinav R K
	 * @description - initialization of parameter.
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFoundException gevonden
	 */
public class Triangle {
	float a,b,c;
	float h;
	float area,perimeter;
	
	public float getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public float getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public float getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	/**
	 * regular
	 * @author Abhinav R K
	 * @param b , h
	 * @return area of type float
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFoundException gevonden
	 */
	
	public float area ()
	{
		return area = (float)(0.5) * b * h;
		
	}
	
	public  float perimeter()
	{
		return perimeter = a+b+c;
	}
	
	

}
