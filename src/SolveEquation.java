import java.util.ArrayList;
import java.util.Iterator;

public class SolveEquation {
	public static void main(String [] args)
	{	
		Polynomial poly = new Polynomial(10,-2,-20);
		Polynomial poly2 = new Polynomial(10, 0,20);
		Polynomial poly3 = new Polynomial(2, 10);
		poly.mZerowe();
		poly2.mZerowe();
		poly3.mZerowe();
		//System.out.println("A : " + poly.s1.getA(poly)+ " B :  " +   poly.s1.getB(poly) + " C : " + poly.s1.getC(poly));
	
		ArrayList <Polynomial> list = new ArrayList<Polynomial>();
		list.add(poly);
		list.add(poly2);
		list.add(poly3);
		
			Iterator<Polynomial> iterator = list.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		
	}
}
