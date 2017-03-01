
public class Polynomial {
		protected double a;
		protected double b;
		protected double c;	
		protected double delta;
		protected double x1;
		protected double x2;
		
		protected boolean zero;
		protected boolean jeden;
		protected boolean dwa;
		protected boolean infi;
		
		protected double p;
		protected double q;
		
		Solution s1 = new Solution();
		
	
		Polynomial(double b,double c)
		{
			this.a = 0;
			this.b = b;
			this.c = c;
		}
		
		Polynomial(double a,double b,double c)
		{

			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		public void mZerowe(){
			if (s1.getA(this)==0)
			{
				if(s1.getB(this)==0 && !(s1.getC(this)==0))
				{
					this.zero = true;
					return;
				}
				else if(s1.getB(this)==0 && (s1.getC(this)==0))
				{
					this.infi = true;
					return;
				}
				this.jeden = true;
				x1 = (-s1.getC(this)) / s1.getB(this);
			}
			else
			{	
				delta =  s1.getB(this)*s1.getB(this) - 4 * s1.getC(this) * s1.getA(this);
				
				Check();//Sprawdzianie ilosci rozwiazan
		
				p = ( -s1.getB(this) )/ (2 * s1.getA(this));
				q = ( -delta ) / (4 * s1.getA(this));
			
				if(zero==true){
				}

				if(jeden==true){
					x1 = ( -s1.getB(this)) / (2 * s1.getA(this));
				}
			
				if(dwa==true){
					x1 = ( -s1.getB(this) - Math.sqrt(delta)) / (2 * s1.getA(this));
					x2 = ( -s1.getB(this) + Math.sqrt(delta)) / (2 * s1.getA(this)); 
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
			strb.append(" \n Rownanie ma postac : " + s1.getA(this) +"x^2 " + "+" + "(" + + s1.getB(this) + ")" +"y " + "+" + "(" +  s1.getC(this)  + ")"   + " \n") ;
			 
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
			
			if(s1.getA(this) == 0)
			{

				str=strb.toString();
				return str;
			}
			
			if(s1.getA(this)>0)
				strb.append("\n Minimum "
						+ "");
			else 
				strb.append("\n Maksimum ");
				
			strb.append(" w punktach p = " + p  + " oraz q = "+ q);
			
			str=strb.toString();
			
			return str;
		}
		

}
