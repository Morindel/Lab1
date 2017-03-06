import java.util.ArrayList;
import java.util.Iterator;

public class SolveEquation {
	public static void main(String [] args)
	{	ArrayList <Polynomial> list = new ArrayList<Polynomial>();
	
		Polynomial poly1 = new Polynomial(10,-2,-20); // d>0
		Polynomial poly2 = new Polynomial(1, 2,1); // d=0 
		Polynomial poly3 = new Polynomial(0, 0); // 0=0
		Polynomial poly4 = new Polynomial(0,1); // b=0 c!=0
		Polynomial poly5 = new Polynomial(2,5); // liniowa
		Polynomial poly6 = new Polynomial(10, 10,20);
		

		poly1.mZerowe();
		poly2.mZerowe();
		poly3.mZerowe();
		poly4.mZerowe();
		poly5.mZerowe();
		poly6.mZerowe();
	

		list.add(poly1);
		list.add(poly2);
		list.add(poly3);
		list.add(poly4);
		list.add(poly5);
		list.add(poly6);
		
			Iterator<Polynomial> iterator = list.iterator();
			while(iterator.hasNext())
			{
				
				System.out.println(iterator.next());
			}
		
	}
}
