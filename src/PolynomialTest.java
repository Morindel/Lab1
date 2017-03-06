import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PolynomialTest {
	private Polynomial p1;
	private Polynomial p2;
	private Polynomial p3;
	private Polynomial p4;
	private Polynomial p5;
	private Polynomial p6;
	
	@Before
	public void set()
	{
		p1 = new Polynomial(1,2,1);// d = 0
		p1.mZerowe();
		
		p2 = new Polynomial(10, 100, 20); // d > 0
		p2.mZerowe();
		
		p3 = new Polynomial(10,0,20); // d < 0
		p3.mZerowe();
		
		p4 = new Polynomial(0,0,0); // 0 = 0
		p4.mZerowe();

		p5 = new Polynomial(0,1); // a=0 b!=0
		p5.mZerowe();
	
		p6 = new Polynomial (2,5); // a=!0 , b!=0
		p6.mZerowe();
		
	}
	@Test
	public void test() {
		
		//delta = 0 , 1 mz ?
		assertTrue( p1.isDwa()==false && p1.isJeden() == true && p1.isZero() == false && p1.isInfi() == false);
		//delta > 0 , 2 mz ?
		assertTrue(p2.isDwa()==true && p2.isJeden() == false && p2.isZero() == false && p2.isInfi() == false);
		//delta < 0 , 1 mz ?
		assertTrue( p3.isDwa()==false && p3.isJeden() == false && p3.isZero() == true && p3.isInfi() == false);
		// 0 = 0
		assertTrue( p4.isDwa()==false && p4.isJeden() == false && p4.isZero() == false && p4.isInfi() == true);
		// 1
		assertTrue( p5.isDwa()==false && p5.isJeden() == false && p5.isZero() == true && p5.isInfi() == false);
		// 2x + 5
		assertTrue( p6.isDwa()==false && p6.isJeden() == true && p6.isZero() == false && p6.isInfi() == false);
		
		}

}
