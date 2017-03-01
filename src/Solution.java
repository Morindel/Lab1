
public class Solution  {
	

	
	Polynomial poly = new Polynomial(10, 5);
	public double delta;
	
	private double x1;
	private double x2;
	
	private boolean zero;
	private boolean jeden;
	private boolean dwa;
	private boolean infi;
	
	private double p;
	private double q;
	
	public void setA(double a) {
		poly.a = a;
	}


	public void setB(double b) {
		poly.b = b;
	}

	public void setC(double c) {
		poly.c = c;
	}
	
	public double  getA() {
		return poly.a;
	}

	public double getB() {
		return poly.b;
	}
	public double  getC(){
		return poly.c;
	}
	
	public void mZerowe(){
		if (getA()==0)
		{
			if(getB()==0 && !(getC()==0))
			{
				this.zero = true;
				return;
			}
			else if(getB()==0 && (getC()==0))
			{
				this.infi = true;
				return;
			}
			this.jeden = true;
			x1 = (-getC()) / getB();
		}
		else
		{	
			delta=getB()*getB() - 4 * getC() * getA();
			Check();
	
			p = ( -getB() )/ (2 * getA());
			q = ( -delta ) / (4 * getA());
		
			if(zero==true){
			}

			if(jeden==true){
				x1 = ( -getB()) / (2 * getA());
			}
		
			if(dwa==true){
				x1 = ( -getB() - Math.sqrt(delta)) / (2 * getA());
				x2 = ( -getB() + Math.sqrt(delta)) / (2 * getA()); 
			}
		}
	}
	public void Check()	{
	
		if (delta<0)
			this.zero = true;
		else if (delta>0)
			this.dwa = true;
		else if (delta == 0)
			this.jeden = true;
		}
			
	
	@Override
	public String toString(){
		String str="";
		StringBuilder strb = new StringBuilder(str);
		strb.append("Rownanie ma postac : " + getA() +"x^2 " + "+" + "(" + + getB() + ")" +"y " + "+" + "(" +  getC()  + ")"   + " \n") ;
		 
		if(zero==true){	
			 strb.append("\n Nie ma miejsc zerowych");
		}
		
		else if(jeden==true){
			strb.append("\n Jedno miejsca zerowe x1 :  " + x1);
		}
		
		else if(dwa==true){
			strb.append("\n Dwa miejsca zerowe x1 : " + x1 + " " + "x2 : " + x2);
		}
		else if(infi==true)
		{
			strb.append("\n Nieskonczonosc miejsc zerowych");
		}
		else
		
			strb.append("\n nie wyznaczyles miejsc zerowych");
		
		if(getA() == 0)
		{

			str=strb.toString();
			return str;
		}
		
		if(getA()>0)
			strb.append("\n Minimum "
					+ "");
		else 
			strb.append("\n Maksimum ");
			
		strb.append(" w punktach p = " + p  + " oraz q = "+ q);
		
		str=strb.toString();
		
		return str;
	}
}
