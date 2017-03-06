
public class Polynomial {
		private double a, b, c;
		private double delta;
	
		private boolean zero , jeden , dwa , infi ;
		
		
		public double getDelta() {
			return delta;
		}

		public boolean isZero() {
			return zero;
		}

		public boolean isJeden() {
			return jeden;
		}

		public boolean isDwa() {
			return dwa;
		}

		public boolean isInfi() {
			return infi;
		}


		private Solution s1 = new Solution();
		
	
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
			if ( a == 0)
			{
				if( b == 0 && !(c==0))
				{
					this.zero = true;
					return;
				}
				else if( b == 0 && c == 0)
				{
					this.infi = true;
					return;
				}
				this.jeden = true;
				s1.setX1( - b / c ) ;
			}
			else
			{	
				delta =  b*b - 4 * a * c;
				
				Check();//Sprawdzianie ilosci rozwiazan
		
				s1.setP( -b /( 2 * a) );
				s1.setQ( -delta  / (4 * a));
			
				if(zero == true)
				{
				}

				else if(jeden == true)
				{
					s1.setX1( ( -b ) / (2 * a) );
				}
			
				else if(dwa == true)
				{
					s1.setX1( (-b - Math.sqrt(delta)) / (2 * a));
					s1.setX2( (-b + Math.sqrt(delta)) / (2 * a)); 
				}
			}
		}
		public void Check()
		{
		
			if (delta < 0)
				this.zero = true;
			else if (delta > 0)
				this.dwa = true;
			else if (delta == 0)
				this.jeden = true;
			}
				
		
		@Override
		public String toString(){
			String str="";
			StringBuilder strb = new StringBuilder(str);
			strb.append(" \n Rownanie ma postac : " + a  +"x^2 " + "+" + "(" + + b + ")" +"x " + "+" + "(" + c  + ")"   + " \n") ;
			 
			if(zero == true)
			{	
				 strb.append("\n Nie ma miejsc zerowych");
			}
			
			else if(jeden == true)
			{
				strb.append("\n Jedno miejsca zerowe x1 :  " + s1.getX1());
			}
			
			else if(dwa == true)
			{
				strb.append("\n Dwa miejsca zerowe x1 : " + s1.getX1() + " " + "x2 : " + s1.getX2());
			}
			
			else if(infi == true)
			{
				strb.append("\n Nieskonczonosc miejsc zerowych");
			}
			
			else
			
				strb.append("\n nie wyznaczyles miejsc zerowych");
			
			if( a == 0)
			{

				str=strb.toString();
				return str;
			}
			
			if( a > 0)
				strb.append("\n Minimum "
						+ "");
			else 
				strb.append("\n Maksimum ");
				
			strb.append(" w punkcie p = " + s1.getP()  + " oraz q = "+ s1.getQ());
			
			str=strb.toString();
			
			return str;
		}
		

}
